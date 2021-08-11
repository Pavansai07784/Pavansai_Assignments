var add = function (x, y) {
    return new Promise(function (resolve, reject) {
        var sum = x + y;
        if (sum) {
            resolve(sum);
        }
        else {
            reject(Error("Could not add the two values!"));
        }
    });
};
// add(2, 2)
//     .then((added) => {
//         // added = 4
//         console.log(added);
//     })
//     .catch((err) => {
//         // If any part of the chain is rejected, print the error message.
//         console.log(err);
//     });
Promise.all([add(2, 2)]).then(function (values) {
    console.log(values);
});
//# sourceMappingURL=A3Q1.js.map