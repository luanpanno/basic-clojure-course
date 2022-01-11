(defn valor-total
  "Calcular valor total incluindo multa"
  [valor]
  (let [percentual-multa 0.1
        valor-multa (* valor percentual-multa)]
    (+ valor valor-multa)))

(println (valor-total 10))