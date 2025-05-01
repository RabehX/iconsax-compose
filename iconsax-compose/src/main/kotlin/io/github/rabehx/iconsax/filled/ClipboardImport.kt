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


val Iconsax.Filled.ClipboardImport: ImageVector
    get() {
        if (_ClipboardImport != null) {
            return _ClipboardImport!!
        }
        _ClipboardImport = ImageVector.Builder(
            name = "Filled.ClipboardImport",
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
                moveTo(15.749f, 17f)
                curveTo(15.749f, 17.41f, 15.409f, 17.75f, 14.999f, 17.75f)
                horizontalLineTo(11.999f)
                curveTo(11.589f, 17.75f, 11.249f, 17.41f, 11.249f, 17f)
                curveTo(11.249f, 16.59f, 11.589f, 16.25f, 11.999f, 16.25f)
                horizontalLineTo(13.189f)
                lineTo(8.469f, 11.53f)
                curveTo(8.179f, 11.24f, 8.179f, 10.759f, 8.469f, 10.469f)
                curveTo(8.759f, 10.179f, 9.239f, 10.179f, 9.529f, 10.469f)
                lineTo(14.249f, 15.189f)
                verticalLineTo(14f)
                curveTo(14.249f, 13.59f, 14.589f, 13.25f, 14.999f, 13.25f)
                curveTo(15.409f, 13.25f, 15.749f, 13.59f, 15.749f, 14f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _ClipboardImport!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardImport: ImageVector? = null
