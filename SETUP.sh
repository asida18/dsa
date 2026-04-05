#!/bin/bash
# ─────────────────────────────────────────────────────────────────────────────
# DSA Repo Setup Script
# Run from inside the dsa-main-branch folder after unzipping.
#
# Prerequisites:
#   1. Create an empty repo named "dsa" on GitHub (no README, no .gitignore)
#   2. Unzip dsa-solutions-branch.zip somewhere on your machine
#   3. Update SOLUTIONS_PATH below to point to that unzipped folder
# ─────────────────────────────────────────────────────────────────────────────

GITHUB_USERNAME="asida18"
SOLUTIONS_PATH="../../Downloads/dsa-repo/"   # ← set this: e.g. "/Users/adrian/Downloads/dsa-repo"

# ── Validate ──────────────────────────────────────────────────────────────────
if [ -z "$SOLUTIONS_PATH" ]; then
  echo "❌ Please set SOLUTIONS_PATH at the top of this script before running."
  exit 1
fi

if [ ! -d "$SOLUTIONS_PATH" ]; then
  echo "❌ SOLUTIONS_PATH does not exist: $SOLUTIONS_PATH"
  exit 1
fi

# ── Step 1: Initialize and push skeletons to main ────────────────────────────
echo "▶ Initializing repo and pushing skeletons to main..."
git init
git add .
git commit -m "Initial commit: problem skeletons with tests"
git remote add origin https://github.com/$GITHUB_USERNAME/dsa.git
git branch -M main
git push -u origin main
echo "✅ main branch pushed (skeletons only)"

# ── Step 2: Create solutions branch ──────────────────────────────────────────
echo ""
echo "▶ Creating solutions branch..."
git checkout -b solutions

# Overwrite skeleton files with full solutions (solutions branch only)
cp -r "$SOLUTIONS_PATH/java/"* ./java/
cp -r "$SOLUTIONS_PATH/javascript/"* ./javascript/

git add .
git commit -m "Add full solutions (private reference — do not merge into main)"
git push -u origin solutions
echo "✅ solutions branch pushed (full implementations)"

# ── Step 3: Return to main for daily work ────────────────────────────────────
git checkout main

echo ""
echo "✅ All done! Two branches created:"
echo "   main      → skeletons (what recruiters see)"
echo "   solutions → full implementations (your private reference)"
echo ""
echo "🔁 Daily workflow:"
echo "   1. Solve a problem on main"
echo "   2. git add . && git commit -m 'Solve: Two Sum (Java)'"
echo "   3. git push origin main"
echo ""
echo "🔍 To peek at a solution without switching branches:"
echo "   git show solutions:java/arrays-strings/TwoSum.java"
