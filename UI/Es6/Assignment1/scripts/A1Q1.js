const number = 42;
try {
    number = 99;
}
catch (err) {
    console.log(err);
    // u will get an error like Cannot assign to "n" because it is a constant
}
console.log(number);
// expected output: 42
//# sourceMappingURL=A1Q1.js.map
