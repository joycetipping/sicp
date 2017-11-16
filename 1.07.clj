;;; Original
; Helpers
(defn square [x] (* x x))

(defn average [numbers]
  (/ (apply + numbers) (count numbers)))

(defn distance [x y] (Math/abs (- x y)))

; Sqrt-iter
(defn good-enough? [guess x]
  (< (distance (square guess) x) 0.001))

(defn improve [guess x]
    (average [guess (/ x guess)]))

(defn sqrt-iter [guess x]
  (if (good-enough? guess x)
      guess
      (sqrt-iter (improve guess x) x)))


;;; Redefining "good-enough?"
(defn good-enough? [guess x]
  (< (distance (improve guess x) guess) (* 0.01 guess)))


;;; Sqrt
(defn sqrt [x] (sqrt-iter 1.0 x))
(println (sqrt 0.0001))
