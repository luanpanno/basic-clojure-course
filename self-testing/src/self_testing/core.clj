(ns self-testing.core)

(defn taxa-entrega
  [valor]
  (if (< valor 100)
    15
    (if (<= valor 200)
      5
      0)))