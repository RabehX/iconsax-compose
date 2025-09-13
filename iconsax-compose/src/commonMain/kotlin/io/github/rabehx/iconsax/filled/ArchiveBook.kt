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

val Iconsax.Filled.ArchiveBook: ImageVector
    get() {
        if (_ArchiveBook != null) {
            return _ArchiveBook!!
        }
        _ArchiveBook = ImageVector.Builder(
            name = "Filled.ArchiveBook",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.93f, 2.5f)
                verticalLineTo(8.4f)
                curveTo(14.93f, 8.84f, 14.41f, 9.06f, 14.09f, 8.77f)
                lineTo(12.34f, 7.16f)
                curveTo(12.15f, 6.98f, 11.85f, 6.98f, 11.66f, 7.16f)
                lineTo(9.91f, 8.76f)
                curveTo(9.59f, 9.06f, 9.07f, 8.83f, 9.07f, 8.4f)
                verticalLineTo(2.5f)
                curveTo(9.07f, 2.22f, 9.29f, 2f, 9.57f, 2f)
                horizontalLineTo(14.43f)
                curveTo(14.71f, 2f, 14.93f, 2.22f, 14.93f, 2.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.98f, 2.059f)
                curveTo(16.69f, 2.019f, 16.43f, 2.269f, 16.43f, 2.559f)
                verticalLineTo(8.579f)
                curveTo(16.43f, 9.339f, 15.98f, 10.029f, 15.28f, 10.339f)
                curveTo(14.58f, 10.639f, 13.77f, 10.509f, 13.21f, 9.989f)
                lineTo(12.34f, 9.189f)
                curveTo(12.15f, 9.009f, 11.86f, 9.009f, 11.66f, 9.189f)
                lineTo(10.79f, 9.989f)
                curveTo(10.43f, 10.329f, 9.96f, 10.499f, 9.49f, 10.499f)
                curveTo(9.23f, 10.499f, 8.97f, 10.449f, 8.72f, 10.339f)
                curveTo(8.02f, 10.029f, 7.57f, 9.339f, 7.57f, 8.579f)
                verticalLineTo(2.559f)
                curveTo(7.57f, 2.269f, 7.31f, 2.019f, 7.02f, 2.059f)
                curveTo(4.22f, 2.409f, 3f, 4.299f, 3f, 6.999f)
                verticalLineTo(16.999f)
                curveTo(3f, 19.999f, 4.5f, 21.999f, 8f, 21.999f)
                horizontalLineTo(16f)
                curveTo(19.5f, 21.999f, 21f, 19.999f, 21f, 16.999f)
                verticalLineTo(6.999f)
                curveTo(21f, 4.299f, 19.78f, 2.409f, 16.98f, 2.059f)
                close()
                moveTo(17.5f, 18.749f)
                horizontalLineTo(9f)
                curveTo(8.59f, 18.749f, 8.25f, 18.409f, 8.25f, 17.999f)
                curveTo(8.25f, 17.589f, 8.59f, 17.249f, 9f, 17.249f)
                horizontalLineTo(17.5f)
                curveTo(17.91f, 17.249f, 18.25f, 17.589f, 18.25f, 17.999f)
                curveTo(18.25f, 18.409f, 17.91f, 18.749f, 17.5f, 18.749f)
                close()
                moveTo(17.5f, 14.749f)
                horizontalLineTo(13.25f)
                curveTo(12.84f, 14.749f, 12.5f, 14.409f, 12.5f, 13.999f)
                curveTo(12.5f, 13.589f, 12.84f, 13.249f, 13.25f, 13.249f)
                horizontalLineTo(17.5f)
                curveTo(17.91f, 13.249f, 18.25f, 13.589f, 18.25f, 13.999f)
                curveTo(18.25f, 14.409f, 17.91f, 14.749f, 17.5f, 14.749f)
                close()
            }
        }.build()

        return _ArchiveBook!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveBook: ImageVector? = null
