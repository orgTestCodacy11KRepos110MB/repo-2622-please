filegroup(
    name = "multiversion_wheel",
    srcs = ["multiversion_wheel.build_defs"],
    visibility = ["//third_party/python:all"],
)

filegroup(
    name = "benchmark",
    srcs = ["benchmark.build_defs"],
    visibility = ["PUBLIC"],
)

filegroup(
    name = "go",
    srcs = ["go.build_defs"],
    visibility = ["PUBLIC"],
)

genrule(
    name = "version",
    srcs = ["//:version"],
    outs = ["version.build_defs"],
    cmd = "echo \"VERSION = '`cat $SRCS`'\" > \"$OUT\"",
    visibility = ["PUBLIC"],
)
