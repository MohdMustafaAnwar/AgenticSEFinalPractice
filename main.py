students = {
    "Aisha": [85, 92, 78],
    "Rahul": [70, 88, 91],
    "Sara": [95, 89, 94],
    "Omar": [60, 75, 80]
}

for name, marks in students.items():
    average = sum(marks) / len(marks)
    print(f"{name}: Average = {average:.2f}")

best_student = max(
    students,
    key=lambda name: sum(students[name]) / len(students[name])
)

print("\nTop student:", best_student)
print("Program completed successfully!")