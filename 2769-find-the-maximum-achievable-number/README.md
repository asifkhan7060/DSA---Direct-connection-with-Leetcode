<h2><a href="https://leetcode.com/problems/find-the-maximum-achievable-number">2812. Find the Maximum Achievable Number</a></h2><h3>Easy</h3><hr><p>Given two integers, <code>num</code> and <code>t</code>. A <strong>number </strong><code>x</code><strong> </strong>is<strong> achievable</strong> if it can become equal to <code>num</code> after applying the following operation <strong>at most</strong> <code>t</code> times:</p>

<ul>
	<li>Increase or decrease <code>x</code> by <code>1</code>, and <em>simultaneously</em> increase or decrease <code>num</code> by <code>1</code>.</li>
</ul>

<p>Return the <strong>maximum </strong>possible value of <code>x</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">num = 4, t = 1</span></p>

<p><strong>Output:</strong> <span class="example-io">6</span></p>

<p><strong>Explanation:</strong></p>

<p>Apply the following operation once to make the maximum achievable number equal to <code>num</code>:</p>

<ul>
	<li>Decrease the maximum achievable number by 1, and increase <code>num</code> by 1.</li>
</ul>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">num = 3, t = 2</span></p>

<p><strong>Output:</strong> <span class="example-io">7</span></p>

<p><strong>Explanation:</strong></p>

<p>Apply the following operation twice to make the maximum achievable number equal to <code>num</code>:</p>

<ul>
	<li>Decrease the maximum achievable number by 1, and increase <code>num</code> by 1.</li>
</ul>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= num, t&nbsp;&lt;= 50</code></li>
</ul>

Here's a concise note you can add to your GitHub repository.

---

# 💡 Understanding the Question

We are given two integers:

* `num`
* `t` (maximum number of operations allowed)

We need to find the **maximum possible starting value of `x`** such that after performing **at most `t` operations**, `x` becomes equal to `num`.

## One Operation

In a single operation, **both numbers must change simultaneously**.

Possible operations are:

```text
x++, num++
x--, num--
x++, num--
x--, num++
```

To get the **maximum possible value of `x`**, we always choose:

```text
x--
num++
```

This reduces the difference between `x` and `num` by **2** in every operation.

---

## Example 1

```text
num = 4
t = 1
```

Suppose:

```text
x = 6
```

One operation:

```text
x   : 6 → 5
num : 4 → 5
```

Now both are equal.

**Answer = 6**

---

## Example 2

```text
num = 3
t = 2
```

Suppose:

```text
x = 7
```

Operation 1:

```text
x   : 7 → 6
num : 3 → 4
```

Operation 2:

```text
x   : 6 → 5
num : 4 → 5
```

Now both are equal.

**Answer = 7**

---

## Key Observation

Each operation increases the **maximum achievable starting value** of `x` by **2`.

So after `t` operations:

```text
x = num + 2 + 2 + ... (t times)
```

which simplifies to:

```java
x = num + (2 * t);
```

This is why the final solution is:

```java
return num + (2 * t);
```

This explanation is short, beginner-friendly, and suitable for GitHub notes.

