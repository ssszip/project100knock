start_time = Time.now
str = "I couldn't believe that I could actually understand what I was reading : the phenomenal power of the human mind ."
arr = str.split(/[\s\.]/)
arr = arr.map! { |word|
  if word.length > 4
    p word[1..-2]
  end
}

p arr
puts(Time.now - start_time)
