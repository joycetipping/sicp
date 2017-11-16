; Helpers
(defn square [x] (* x x))

(defn distance [x y] (Math/abs (- x y)))

; Cbrt-iter
(defn improve [guess x]
    (/ (+ (/ x (Math/pow guess 2))
          (* 2 guess))
       3))

(defn good-enough? [guess x]
  (< (distance (improve guess x) guess)
     (* 0.01 guess)))

(defn cbrt-iter [guess x]
  (if (good-enough? guess x)
      guess
      (cbrt-iter (improve guess x) x)))

; Cbrt
(defn cbrt [x] (cbrt-iter 1.0 x))
(println (cbrt 8))
