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

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax


val Iconsax.Filled.VideoHorizontal: ImageVector
    get() {
        if (_VideoHorizontal != null) {
            return _VideoHorizontal!!
        }
        _VideoHorizontal = ImageVector.Builder(
            name = "Filled.VideoHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.25f, 7.859f)
                horizontalLineTo(2f)
                verticalLineTo(16.189f)
                curveTo(2f, 16.249f, 2f, 16.309f, 2.01f, 16.359f)
                horizontalLineTo(11.25f)
                verticalLineTo(7.859f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.691f, 6.36f)
                horizontalLineTo(11.251f)
                verticalLineTo(2f)
                horizontalLineTo(7.721f)
                verticalLineTo(6.24f)
                curveTo(7.721f, 6.28f, 7.701f, 6.32f, 7.691f, 6.36f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.219f, 6.24f)
                verticalLineTo(2.16f)
                curveTo(3.999f, 2.62f, 2.549f, 4.1f, 2.129f, 6.36f)
                horizontalLineTo(6.239f)
                curveTo(6.229f, 6.32f, 6.219f, 6.28f, 6.219f, 6.24f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.22f, 2f)
                horizontalLineTo(12.75f)
                verticalLineTo(6.36f)
                horizontalLineTo(16.22f)
                verticalLineTo(2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.711f, 6.358f)
                horizontalLineTo(21.871f)
                curveTo(21.451f, 4.078f, 19.981f, 2.588f, 17.721f, 2.148f)
                verticalLineTo(6.328f)
                curveTo(17.721f, 6.338f, 17.711f, 6.348f, 17.711f, 6.358f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.719f, 21.849f)
                curveTo(19.909f, 21.419f, 21.349f, 20.019f, 21.819f, 17.859f)
                horizontalLineTo(17.719f)
                verticalLineTo(21.849f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.22f, 17.859f)
                horizontalLineTo(12.75f)
                verticalLineTo(21.999f)
                horizontalLineTo(16.22f)
                verticalLineTo(17.859f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.75f, 16.359f)
                horizontalLineTo(21.99f)
                curveTo(22f, 16.309f, 22f, 16.249f, 22f, 16.189f)
                verticalLineTo(7.859f)
                horizontalLineTo(12.75f)
                verticalLineTo(16.359f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.249f, 17.859f)
                horizontalLineTo(7.719f)
                verticalLineTo(21.999f)
                horizontalLineTo(11.249f)
                verticalLineTo(17.859f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2.18f, 17.859f)
                curveTo(2.65f, 19.999f, 4.07f, 21.399f, 6.22f, 21.839f)
                verticalLineTo(17.859f)
                horizontalLineTo(2.18f)
                close()
            }
        }.build()

        return _VideoHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _VideoHorizontal: ImageVector? = null
