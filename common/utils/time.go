package utils

import (
	"github.com/BETEPOK3/tawt-scheduler/common/funcs"
	"time"
)

const standardLayout = "2006-01-02T15:04:05Z"

// TimeToPb - преобразование даты и времени в строку.
func TimeToPb(src time.Time) string {
	return src.Format(standardLayout)
}

// PtrTimeToPb - преобразование даты и времени в строку. В случае nil на выходе тоже будет nil.
func PtrTimeToPb(src *time.Time) *string {
	if src == nil {
		return nil
	}

	return funcs.Ptr(TimeToPb(*src))
}

// MustTimeFromPb - преобразование строки в дату и время. В случае ошибки - паника.
func MustTimeFromPb(src string) time.Time {
	result, err := time.Parse(standardLayout, src)
	if err != nil {
		panic(err)
	}

	return result
}

// PtrMustTimeFromPb - преобразование строки в дату и время. В случае ошибки - паника. В случае nil на выходе тоже будет nil.
func PtrMustTimeFromPb(src *string) *time.Time {
	if src == nil {
		return nil
	}

	return funcs.Ptr(MustTimeFromPb(*src))
}
