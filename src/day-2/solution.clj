(ns solution
  (:require [clojure.string :as cstr]))

(def input (slurp "./src/day-2/input-main.txt"))

(defn first-solution-values [strategy]
  (cond
    (= strategy "A X") 4
    (= strategy "B Y") 5
    (= strategy "C Z") 6
    (= strategy "A Y") 8
    (= strategy "A Z") 3
    (= strategy "B X") 1
    (= strategy "B Z") 9
    (= strategy "C X") 7
    (= strategy "C Y") 2))

(defn second-solution-values [strategy]
  (cond
    (= strategy "A X") 3
    (= strategy "B Y") 5
    (= strategy "C Z") 7
    (= strategy "A Y") 4
    (= strategy "A Z") 8
    (= strategy "B X") 1
    (= strategy "B Z") 9
    (= strategy "C X") 2
    (= strategy "C Y") 7))

;; solution for the first 
(->> (cstr/split-lines input)
     (map #(first-solution-values %))
     (reduce +))

;; solution for the second
(->> (cstr/split-lines input)
     (map #(second-solution-values %))
     (reduce +))
