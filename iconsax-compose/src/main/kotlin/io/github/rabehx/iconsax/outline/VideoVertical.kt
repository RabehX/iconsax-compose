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

val Iconsax.Outline.VideoVertical: ImageVector
    get() {
        if (_VideoVertical != null) {
            return _VideoVertical!!
        }
        _VideoVertical = ImageVector.Builder(
            name = "Outline.VideoVertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.891f, 22.23f)
                curveTo(6.481f, 22.23f, 6.141f, 21.89f, 6.141f, 21.48f)
                verticalLineTo(2.52f)
                curveTo(6.141f, 2.11f, 6.481f, 1.77f, 6.891f, 1.77f)
                curveTo(7.301f, 1.77f, 7.641f, 2.1f, 7.641f, 2.52f)
                verticalLineTo(21.48f)
                curveTo(7.641f, 21.9f, 7.301f, 22.23f, 6.891f, 22.23f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.891f, 22.23f)
                curveTo(16.481f, 22.23f, 16.141f, 21.89f, 16.141f, 21.48f)
                verticalLineTo(2.52f)
                curveTo(16.141f, 2.11f, 16.481f, 1.77f, 16.891f, 1.77f)
                curveTo(17.301f, 1.77f, 17.641f, 2.11f, 17.641f, 2.52f)
                verticalLineTo(21.48f)
                curveTo(17.641f, 21.9f, 17.301f, 22.23f, 16.891f, 22.23f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.889f, 7.72f)
                horizontalLineTo(2.539f)
                curveTo(2.129f, 7.72f, 1.789f, 7.38f, 1.789f, 6.97f)
                curveTo(1.789f, 6.56f, 2.129f, 6.22f, 2.539f, 6.22f)
                horizontalLineTo(6.889f)
                curveTo(7.299f, 6.22f, 7.639f, 6.56f, 7.639f, 6.97f)
                curveTo(7.639f, 7.38f, 7.299f, 7.72f, 6.889f, 7.72f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.889f, 12.75f)
                horizontalLineTo(2.029f)
                curveTo(1.619f, 12.75f, 1.279f, 12.41f, 1.279f, 12f)
                curveTo(1.279f, 11.59f, 1.619f, 11.25f, 2.029f, 11.25f)
                horizontalLineTo(6.889f)
                curveTo(7.299f, 11.25f, 7.639f, 11.59f, 7.639f, 12f)
                curveTo(7.639f, 12.41f, 7.299f, 12.75f, 6.889f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.89f, 17.72f)
                horizontalLineTo(2.48f)
                curveTo(2.07f, 17.72f, 1.73f, 17.38f, 1.73f, 16.97f)
                curveTo(1.73f, 16.56f, 2.07f, 16.22f, 2.48f, 16.22f)
                horizontalLineTo(6.89f)
                curveTo(7.3f, 16.22f, 7.64f, 16.56f, 7.64f, 16.97f)
                curveTo(7.64f, 17.38f, 7.3f, 17.72f, 6.89f, 17.72f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.889f, 7.72f)
                horizontalLineTo(17.539f)
                curveTo(17.129f, 7.72f, 16.789f, 7.38f, 16.789f, 6.97f)
                curveTo(16.789f, 6.56f, 17.129f, 6.22f, 17.539f, 6.22f)
                horizontalLineTo(21.889f)
                curveTo(22.299f, 6.22f, 22.639f, 6.56f, 22.639f, 6.97f)
                curveTo(22.639f, 7.38f, 22.299f, 7.72f, 21.889f, 7.72f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.889f, 12.75f)
                horizontalLineTo(17.029f)
                curveTo(16.619f, 12.75f, 16.279f, 12.41f, 16.279f, 12f)
                curveTo(16.279f, 11.59f, 16.619f, 11.25f, 17.029f, 11.25f)
                horizontalLineTo(21.889f)
                curveTo(22.299f, 11.25f, 22.639f, 11.59f, 22.639f, 12f)
                curveTo(22.639f, 12.41f, 22.299f, 12.75f, 21.889f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.971f, 12.75f)
                horizontalLineTo(5.971f)
                curveTo(5.561f, 12.75f, 5.221f, 12.41f, 5.221f, 12f)
                curveTo(5.221f, 11.59f, 5.561f, 11.25f, 5.971f, 11.25f)
                horizontalLineTo(16.971f)
                curveTo(17.381f, 11.25f, 17.721f, 11.59f, 17.721f, 12f)
                curveTo(17.721f, 12.41f, 17.391f, 12.75f, 16.971f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.89f, 17.72f)
                horizontalLineTo(17.48f)
                curveTo(17.07f, 17.72f, 16.73f, 17.38f, 16.73f, 16.97f)
                curveTo(16.73f, 16.56f, 17.07f, 16.22f, 17.48f, 16.22f)
                horizontalLineTo(21.89f)
                curveTo(22.301f, 16.22f, 22.64f, 16.56f, 22.64f, 16.97f)
                curveTo(22.64f, 17.38f, 22.301f, 17.72f, 21.89f, 17.72f)
                close()
            }
        }.build()

        return _VideoVertical!!
    }

@Suppress("ObjectPropertyName")
private var _VideoVertical: ImageVector? = null
