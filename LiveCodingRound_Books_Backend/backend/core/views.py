from rest_framework import viewsets
from core.models import Book
from core.serializers import BookSerializer


class BookViewSet(viewsets.ModelViewSet):
    queryset = Book.objects.all()
    serializer_class = BookSerializer
    http_method_names = ['get', 'post', 'put', 'patch', 'delete']