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


val Iconsax.Filled.ClipboardText: ImageVector
    get() {
        if (_ClipboardText != null) {
            return _ClipboardText!!
        }
        _ClipboardText = ImageVector.Builder(
            name = "Filled.ClipboardText",
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
                moveTo(12.379f, 16.949f)
                horizontalLineTo(7.999f)
                curveTo(7.589f, 16.949f, 7.249f, 16.61f, 7.249f, 16.199f)
                curveTo(7.249f, 15.79f, 7.589f, 15.45f, 7.999f, 15.45f)
                horizontalLineTo(12.379f)
                curveTo(12.789f, 15.45f, 13.129f, 15.79f, 13.129f, 16.199f)
                curveTo(13.129f, 16.61f, 12.789f, 16.949f, 12.379f, 16.949f)
                close()
                moveTo(14.999f, 12.95f)
                horizontalLineTo(7.999f)
                curveTo(7.589f, 12.95f, 7.249f, 12.609f, 7.249f, 12.2f)
                curveTo(7.249f, 11.79f, 7.589f, 11.45f, 7.999f, 11.45f)
                horizontalLineTo(14.999f)
                curveTo(15.409f, 11.45f, 15.749f, 11.79f, 15.749f, 12.2f)
                curveTo(15.749f, 12.609f, 15.409f, 12.95f, 14.999f, 12.95f)
                close()
            }
        }.build()

        return _ClipboardText!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardText: ImageVector? = null
