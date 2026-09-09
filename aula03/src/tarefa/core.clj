;;; Para testar os exercícios comente o exercício descomentado e descomente o desejado. Para executar o programa, abra o terminal na pasta do projeto e digite: lein run

(ns tarefa.core
  (:require [clojure.repl :refer [doc]]))

(defn -main [& args]

  ;;;(println "Exercício 1")
  ;;;(println (+ 8 5))
  ;;;(println (* 6 7))
  ;;;(println (/ 20 4))
  ;;;(println (- 15 9))
  ;;;(println (* (+ 2 3) (+ 4 5)))

  ;;;(println "Exercício 2")
  ;;;(println (str "Programação" " Funcional" " com Clojure"))
  ;;;(println (str "Enzo" " está aprendendo Clojure")))

  ;;;(println "Exercício 3")
  ;;;(doc str)
  ;;;(doc map)
  ;;;(doc doc))

  ;;;(println "Exercício 4")
  ;;;(println (first '(10 20 30 40)))
  ;;;(println (rest '(10 20 30 40)))
  ;;;(println (count '(10 20 30 40))))

  ;;;(println "Exercício 5")
  ;;;(println "Lista tratadada como dado: " '(10 20 30 40))
  ;;;(println "Outra lista tratadada como dado: " '(+ 2 3)))

  ;;;(println "Exercício 6")
  ;;;(println (if (> 7 5) "Aprovado" "Reprovado"))
  ;;;(println (if (> 3 5) "Aprovado" (+ 100 50))))

  ;;;(println "Exercício 7")
  ;;;(println "Iniciando cálculo...")
  ;;;(println (+ 4 6))
  ;;;(println "Cálculo finalizado!"))

  ;;;(println "Exercício 8")
  ;;;(defn estudandoWhen [num]
  ;;;(when (>= num 18)
    ;;;(println "Executando o bloco when") (println (rand-int 100))))
  ;;;(estudandoWhen 20)
  ;;;(estudandoWhen 15))

  ;;;(println "Exercício 9")
  ;;;(def nome-aluno "Enzo")
  ;;;(def nota1 8)
  ;;;nome-aluno
  ;;;nota1
  ;;;(println (str nome-aluno " tirou " nota1 " na primeira prova.")))

  (println "Exercício 10")
  (let [a 10
        b 5]
    (println "Soma: " (+ a b))
    (println "Produto: " (* a b))
    (println "Os valores de a e b são locais ao bloco")))