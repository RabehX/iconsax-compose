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


val Iconsax.Filled.ClipboardClose: ImageVector
    get() {
        if (_ClipboardClose != null) {
            return _ClipboardClose!!
        }
        _ClipboardClose = ImageVector.Builder(
            name = "Filled.ClipboardClose",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.35f, 2f)
                horizontalLineTo(9.65f)
                curveTo(8.61f, 2f, 7.76f, 2.84f, 7.76f, 3.88f)
                verticalLineTo(4.82f)
                curveTo(7.76f, 5.86f, 8.6f, 6.7f, 9.64f, 6.7f)
                horizontalLineTo(14.35f)
                curveTo(15.39f, 6.7f, 16.23f, 5.86f, 16.23f, 4.82f)
                verticalLineTo(3.88f)
                curveTo(16.24f, 2.84f, 15.39f, 2f, 14.35f, 2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.239f, 4.819f)
                curveTo(17.239f, 6.409f, 15.939f, 7.709f, 14.349f, 7.709f)
                horizontalLineTo(9.649f)
                curveTo(8.059f, 7.709f, 6.759f, 6.409f, 6.759f, 4.819f)
                curveTo(6.759f, 4.259f, 6.159f, 3.909f, 5.659f, 4.169f)
                curveTo(4.249f, 4.919f, 3.289f, 6.409f, 3.289f, 8.119f)
                verticalLineTo(17.529f)
                curveTo(3.289f, 19.99f, 5.299f, 22f, 7.759f, 22f)
                horizontalLineTo(16.239f)
                curveTo(18.699f, 22f, 20.709f, 19.99f, 20.709f, 17.529f)
                verticalLineTo(8.119f)
                curveTo(20.709f, 6.409f, 19.749f, 4.919f, 18.339f, 4.169f)
                curveTo(17.839f, 3.909f, 17.239f, 4.259f, 17.239f, 4.819f)
                close()
                moveTo(14.529f, 16.69f)
                curveTo(14.379f, 16.84f, 14.189f, 16.91f, 13.999f, 16.91f)
                curveTo(13.809f, 16.91f, 13.619f, 16.84f, 13.469f, 16.69f)
                lineTo(12.019f, 15.24f)
                lineTo(10.529f, 16.729f)
                curveTo(10.379f, 16.879f, 10.189f, 16.949f, 9.999f, 16.949f)
                curveTo(9.809f, 16.949f, 9.619f, 16.879f, 9.469f, 16.729f)
                curveTo(9.179f, 16.44f, 9.179f, 15.96f, 9.469f, 15.67f)
                lineTo(10.959f, 14.179f)
                lineTo(9.509f, 12.729f)
                curveTo(9.219f, 12.439f, 9.219f, 11.96f, 9.509f, 11.67f)
                curveTo(9.799f, 11.38f, 10.279f, 11.38f, 10.569f, 11.67f)
                lineTo(12.019f, 13.12f)
                lineTo(13.419f, 11.719f)
                curveTo(13.709f, 11.429f, 14.189f, 11.429f, 14.479f, 11.719f)
                curveTo(14.769f, 12.009f, 14.769f, 12.49f, 14.479f, 12.78f)
                lineTo(13.079f, 14.179f)
                lineTo(14.529f, 15.63f)
                curveTo(14.819f, 15.92f, 14.819f, 16.389f, 14.529f, 16.69f)
                close()
            }
        }.build()

        return _ClipboardClose!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardClose: ImageVector? = null
