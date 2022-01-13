(ns arrays.core-test
  (:require [clojure.test :refer :all]
            [arrays.core :refer :all]))

(deftest main-test
  (testing "primeiro-nome"
    (is (= "Luan" (primeiro-nome ["Luan"])))
    (is (= "Desconhecido" (primeiro-nome nil))))
  (testing "substituir-primeiro-nome"
    (is (= ["Luan"] (substituir-primeiro-nome ["Marcio"] "Luan")))))