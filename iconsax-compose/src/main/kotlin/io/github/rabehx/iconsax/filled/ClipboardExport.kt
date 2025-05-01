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


val Iconsax.Filled.ClipboardExport: ImageVector
    get() {
        if (_ClipboardExport != null) {
            return _ClipboardExport!!
        }
        _ClipboardExport = ImageVector.Builder(
            name = "Filled.ClipboardExport",
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
                moveTo(15.529f, 17.529f)
                curveTo(15.379f, 17.68f, 15.189f, 17.75f, 14.999f, 17.75f)
                curveTo(14.809f, 17.75f, 14.619f, 17.68f, 14.469f, 17.529f)
                lineTo(9.749f, 12.809f)
                verticalLineTo(14f)
                curveTo(9.749f, 14.41f, 9.409f, 14.75f, 8.999f, 14.75f)
                curveTo(8.589f, 14.75f, 8.249f, 14.41f, 8.249f, 14f)
                verticalLineTo(11f)
                curveTo(8.249f, 10.59f, 8.589f, 10.25f, 8.999f, 10.25f)
                horizontalLineTo(11.999f)
                curveTo(12.409f, 10.25f, 12.749f, 10.59f, 12.749f, 11f)
                curveTo(12.749f, 11.41f, 12.409f, 11.75f, 11.999f, 11.75f)
                horizontalLineTo(10.809f)
                lineTo(15.529f, 16.469f)
                curveTo(15.819f, 16.76f, 15.819f, 17.24f, 15.529f, 17.529f)
                close()
            }
        }.build()

        return _ClipboardExport!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardExport: ImageVector? = null
