(defn average
  [numbers]
  (/ (apply + numbers) (count numbers)))

(average [8 28 33 4318])

(println (average [9 18]))
