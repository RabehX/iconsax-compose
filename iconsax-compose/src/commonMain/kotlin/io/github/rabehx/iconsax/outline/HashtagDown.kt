/*
 *
 *  * Copyright (c) 2025, Рабeх Аззам
 *  *
 *  * This file is part of Iconsax Compose.
 *  *
 *  * Iconsax Compose is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * Iconsax Compose is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with Iconsax Compose. If not, see <https://www.gnu.org/licenses/>.
 *
 */

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.HashtagDown: ImageVector
    get() {
        if (_HashtagDown != null) {
            return _HashtagDown!!
        }
        _HashtagDown = ImageVector.Builder(
            name = "Outline.HashtagDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(13f)
                curveTo(22.75f, 13.41f, 22.41f, 13.75f, 22f, 13.75f)
                curveTo(21.59f, 13.75f, 21.25f, 13.41f, 21.25f, 13f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(14f)
                curveTo(14.41f, 21.25f, 14.75f, 21.59f, 14.75f, 22f)
                curveTo(14.75f, 22.41f, 14.41f, 22.75f, 14f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 22.75f)
                curveTo(18.9f, 22.75f, 18.81f, 22.73f, 18.71f, 22.69f)
                curveTo(18.43f, 22.57f, 18.25f, 22.3f, 18.25f, 22f)
                verticalLineTo(16f)
                curveTo(18.25f, 15.59f, 18.59f, 15.25f, 19f, 15.25f)
                curveTo(19.41f, 15.25f, 19.75f, 15.59f, 19.75f, 16f)
                verticalLineTo(20.19f)
                lineTo(20.47f, 19.47f)
                curveTo(20.76f, 19.18f, 21.24f, 19.18f, 21.53f, 19.47f)
                curveTo(21.82f, 19.76f, 21.82f, 20.24f, 21.53f, 20.53f)
                lineTo(19.53f, 22.53f)
                curveTo(19.39f, 22.67f, 19.19f, 22.75f, 19f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 22.75f)
                curveTo(18.809f, 22.75f, 18.619f, 22.68f, 18.469f, 22.53f)
                lineTo(16.469f, 20.53f)
                curveTo(16.18f, 20.24f, 16.18f, 19.76f, 16.469f, 19.47f)
                curveTo(16.76f, 19.18f, 17.24f, 19.18f, 17.529f, 19.47f)
                lineTo(19.529f, 21.47f)
                curveTo(19.819f, 21.76f, 19.819f, 22.24f, 19.529f, 22.53f)
                curveTo(19.379f, 22.68f, 19.19f, 22.75f, 19f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.9f, 16.49f)
                curveTo(8.87f, 16.49f, 8.84f, 16.49f, 8.82f, 16.49f)
                curveTo(8.41f, 16.44f, 8.11f, 16.07f, 8.16f, 15.66f)
                lineTo(9.2f, 6.18f)
                curveTo(9.25f, 5.77f, 9.61f, 5.47f, 10.03f, 5.52f)
                curveTo(10.44f, 5.57f, 10.74f, 5.94f, 10.69f, 6.35f)
                lineTo(9.64f, 15.82f)
                curveTo(9.6f, 16.2f, 9.27f, 16.49f, 8.9f, 16.49f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.05f, 16.49f)
                curveTo(12.02f, 16.49f, 11.99f, 16.49f, 11.97f, 16.49f)
                curveTo(11.56f, 16.44f, 11.26f, 16.07f, 11.31f, 15.66f)
                lineTo(12.36f, 6.19f)
                curveTo(12.41f, 5.78f, 12.78f, 5.48f, 13.19f, 5.53f)
                curveTo(13.6f, 5.58f, 13.9f, 5.95f, 13.85f, 6.36f)
                lineTo(12.8f, 15.83f)
                curveTo(12.76f, 16.2f, 12.43f, 16.49f, 12.05f, 16.49f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.999f, 10.17f)
                horizontalLineTo(6.529f)
                curveTo(6.119f, 10.17f, 5.779f, 9.83f, 5.779f, 9.42f)
                curveTo(5.779f, 9.01f, 6.119f, 8.67f, 6.529f, 8.67f)
                horizontalLineTo(15.999f)
                curveTo(16.409f, 8.67f, 16.749f, 9.01f, 16.749f, 9.42f)
                curveTo(16.749f, 9.83f, 16.409f, 10.17f, 15.999f, 10.17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.47f, 13.33f)
                horizontalLineTo(6f)
                curveTo(5.59f, 13.33f, 5.25f, 12.99f, 5.25f, 12.58f)
                curveTo(5.25f, 12.17f, 5.59f, 11.83f, 6f, 11.83f)
                horizontalLineTo(15.47f)
                curveTo(15.88f, 11.83f, 16.22f, 12.17f, 16.22f, 12.58f)
                curveTo(16.22f, 12.99f, 15.89f, 13.33f, 15.47f, 13.33f)
                close()
            }
        }.build()

        return _HashtagDown!!
    }

@Suppress("ObjectPropertyName")
private var _HashtagDown: ImageVector? = null
