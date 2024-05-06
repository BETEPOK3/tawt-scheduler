package entities

// TaskType - тип задачи.
type TaskType string

const (
	TaskTypeUnspecified         TaskType = ""
	TaskTypeGraphematical       TaskType = "GRAPHEMATICAL"
	TaskTypeGama                TaskType = "GAMA"
	TaskTypeDisambiguationFalse TaskType = "DISAMBIGUATION_FALSE"
	TaskTypeDisambiguationTrue  TaskType = "DISAMBIGUATION_TRUE"
	TaskTypeSyntax              TaskType = "SYNTAX"
)
