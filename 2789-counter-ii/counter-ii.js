/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let i=init;
    return {
        increment:(val1)=>{
            return ++init;
        },
        decrement:(val2)=>{
            return --init;
        },
        reset:(val3)=>{
            init=i
            return init;
        }
    }
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */