(ns app)
(import '(spark Spark Route))

(defn -main
  [& args]
  (Spark/get "/hello" (reify Route (handle [this req res] "Hello, World!!")))
)
