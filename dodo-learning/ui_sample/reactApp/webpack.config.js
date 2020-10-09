module.exports = {
    entry: ["./app.js","./global.js"],
    output: {
        filename:"bundle.js"
    },
    resolve: {
        extensions: ['.js', '.jsx']
    },
    module: {
        rules: [
            {
                test: /\.(js|jsx)$/,
                exclude:/(node_modules|bower_components)/,
                use: [{
                    loader: 'babel-loader',
                    query: {
                        presets: ['es2015', 'react']
                    }
                }]
            }
        ]
    }
}
