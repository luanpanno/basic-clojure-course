(ns self-testing.core-test
  (:require [clojure.test :refer :all]
            [self-testing.core :refer :all]))

(deftest main-test
  (testing "Se valor for abaixo de 100 reais, a taxa de entrega deve ser de 15 reais"
    (is (= 15 (taxa-entrega 0)))
    (is (not (= 15 (taxa-entrega 100)))))
  (testing "Se valor for entre 100 e 200 reais, a taxa de entrega deve ser de 5 reais"
    (is (= 5 (taxa-entrega 100)))
    (is (not (= 5 (taxa-entrega 201)))))
  (testing "Se valor for acima de 200 reais, a taxa de entrega deve ser 0"
    (is (= 0 (taxa-entrega 201)))))
