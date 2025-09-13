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

val Iconsax.Outline.VideoHorizontal: ImageVector
    get() {
        if (_VideoHorizontal != null) {
            return _VideoHorizontal!!
        }
        _VideoHorizontal = ImageVector.Builder(
            name = "Outline.VideoHorizontal",
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
                moveTo(21.479f, 17.86f)
                horizontalLineTo(2.52f)
                curveTo(2.11f, 17.86f, 1.77f, 17.52f, 1.77f, 17.11f)
                curveTo(1.77f, 16.7f, 2.11f, 16.36f, 2.52f, 16.36f)
                horizontalLineTo(21.479f)
                curveTo(21.889f, 16.36f, 22.229f, 16.7f, 22.229f, 17.11f)
                curveTo(22.229f, 17.52f, 21.899f, 17.86f, 21.479f, 17.86f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.479f, 7.86f)
                horizontalLineTo(2.52f)
                curveTo(2.11f, 7.86f, 1.77f, 7.52f, 1.77f, 7.11f)
                curveTo(1.77f, 6.7f, 2.1f, 6.36f, 2.52f, 6.36f)
                horizontalLineTo(21.479f)
                curveTo(21.889f, 6.36f, 22.229f, 6.7f, 22.229f, 7.11f)
                curveTo(22.229f, 7.52f, 21.899f, 7.86f, 21.479f, 7.86f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.971f, 22.21f)
                curveTo(6.561f, 22.21f, 6.221f, 21.87f, 6.221f, 21.46f)
                verticalLineTo(17.11f)
                curveTo(6.221f, 16.7f, 6.561f, 16.36f, 6.971f, 16.36f)
                curveTo(7.381f, 16.36f, 7.721f, 16.7f, 7.721f, 17.11f)
                verticalLineTo(21.46f)
                curveTo(7.721f, 21.88f, 7.381f, 22.21f, 6.971f, 22.21f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.72f)
                curveTo(11.59f, 22.72f, 11.25f, 22.38f, 11.25f, 21.97f)
                verticalLineTo(17.11f)
                curveTo(11.25f, 16.7f, 11.59f, 16.36f, 12f, 16.36f)
                curveTo(12.41f, 16.36f, 12.75f, 16.7f, 12.75f, 17.11f)
                verticalLineTo(21.97f)
                curveTo(12.75f, 22.38f, 12.41f, 22.72f, 12f, 22.72f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.971f, 22.27f)
                curveTo(16.561f, 22.27f, 16.221f, 21.93f, 16.221f, 21.52f)
                verticalLineTo(17.11f)
                curveTo(16.221f, 16.7f, 16.561f, 16.36f, 16.971f, 16.36f)
                curveTo(17.381f, 16.36f, 17.721f, 16.7f, 17.721f, 17.11f)
                verticalLineTo(21.52f)
                curveTo(17.721f, 21.94f, 17.381f, 22.27f, 16.971f, 22.27f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.971f, 7.21f)
                curveTo(6.561f, 7.21f, 6.221f, 6.87f, 6.221f, 6.46f)
                verticalLineTo(2.11f)
                curveTo(6.221f, 1.7f, 6.561f, 1.36f, 6.971f, 1.36f)
                curveTo(7.381f, 1.36f, 7.721f, 1.7f, 7.721f, 2.11f)
                verticalLineTo(6.46f)
                curveTo(7.721f, 6.88f, 7.381f, 7.21f, 6.971f, 7.21f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 7.72f)
                curveTo(11.59f, 7.72f, 11.25f, 7.38f, 11.25f, 6.97f)
                verticalLineTo(2.11f)
                curveTo(11.25f, 1.7f, 11.59f, 1.36f, 12f, 1.36f)
                curveTo(12.41f, 1.36f, 12.75f, 1.7f, 12.75f, 2.11f)
                verticalLineTo(6.97f)
                curveTo(12.75f, 7.38f, 12.41f, 7.72f, 12f, 7.72f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 18.78f)
                curveTo(11.59f, 18.78f, 11.25f, 18.44f, 11.25f, 18.03f)
                verticalLineTo(7.03f)
                curveTo(11.25f, 6.62f, 11.59f, 6.28f, 12f, 6.28f)
                curveTo(12.41f, 6.28f, 12.75f, 6.62f, 12.75f, 7.03f)
                verticalLineTo(18.03f)
                curveTo(12.75f, 18.44f, 12.41f, 18.78f, 12f, 18.78f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.971f, 7.27f)
                curveTo(16.561f, 7.27f, 16.221f, 6.93f, 16.221f, 6.52f)
                verticalLineTo(2.11f)
                curveTo(16.221f, 1.7f, 16.561f, 1.36f, 16.971f, 1.36f)
                curveTo(17.381f, 1.36f, 17.721f, 1.7f, 17.721f, 2.11f)
                verticalLineTo(6.52f)
                curveTo(17.721f, 6.94f, 17.381f, 7.27f, 16.971f, 7.27f)
                close()
            }
        }.build()

        return _VideoHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _VideoHorizontal: ImageVector? = null
