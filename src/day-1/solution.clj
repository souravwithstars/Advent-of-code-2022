(ns solution
  (:require [clojure.string :as cstr]))

(def input (slurp "./src/day-1/input-main.txt"))

;;solution for the first part
(->> (cstr/split-lines input)
     (partition-by empty?)
     (take-nth 2)
     (map #(map read-string %))
     (map #(apply + %))
     (apply max-key max))

;;solution for the second part
(->> (cstr/split-lines input)
     (partition-by empty?)
     (take-nth 2)
     (map #(map read-string %))
     (map #(apply + %))
     (sort #(- %2 %1))
     (take 3)
     (apply +))
