(ns arrays.core)

(defn primeiro-nome
  [nomes]
  (get nomes 0 "Desconhecido"))

(defn substituir-primeiro-nome
  [nomes novo-primeiro-nome]
  (assoc nomes 0 novo-primeiro-nome))
