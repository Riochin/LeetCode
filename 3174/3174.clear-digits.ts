/*
 * @lc app=leetcode id=3174 lang=typescript
 *
 * [3174] Clear Digits
 */

// @lc code=start
function clearDigits(s: string): string {
  let chars: string[] = s.split("");
  const n = chars.length;

  for (let i: number = 0; i < n; i++) {
    if (!Number.isNaN(parseInt(chars[i]))) {
      chars.splice(i - 1, 2);
      i=0;
    }
  }

  const result = chars.join("");

  return result;
}
// @lc code=end
