function area(...args) {
	let area = 0;

	if (args.length == 1) {
		area = "area of circle is " + 3.14 * args[0] * args[0];
	}

	if (args.length == 2) {
		area = "area of rectangle is " + args[0] * args[1];
	}
	if (args.length == 2 && args[0] == args[1]) {
		area = "area of square is " + args[0] * args[1];
	}

	return area;
}

const b = area(3);
console.log(b);
const c = area(3, 4);
console.log(c);
const d = area(4, 4);
console.log(d);
