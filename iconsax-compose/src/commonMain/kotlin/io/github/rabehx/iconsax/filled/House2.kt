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


val Iconsax.Filled.House2: ImageVector
    get() {
        if (_House2 != null) {
            return _House2!!
        }
        _House2 = ImageVector.Builder(
            name = "Filled.House2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10f, 15.5f)
                curveTo(9.59f, 15.5f, 9.25f, 15.84f, 9.25f, 16.25f)
                verticalLineTo(17.75f)
                curveTo(9.25f, 18.16f, 9.59f, 18.5f, 10f, 18.5f)
                curveTo(10.41f, 18.5f, 10.75f, 18.16f, 10.75f, 17.75f)
                verticalLineTo(16.25f)
                curveTo(10.75f, 15.84f, 10.41f, 15.5f, 10f, 15.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 21.249f)
                horizontalLineTo(21f)
                verticalLineTo(9.979f)
                curveTo(21f, 9.359f, 20.72f, 8.779f, 20.23f, 8.399f)
                lineTo(13.23f, 2.959f)
                curveTo(12.51f, 2.389f, 11.49f, 2.389f, 10.77f, 2.959f)
                lineTo(3.77f, 8.399f)
                curveTo(3.28f, 8.779f, 3f, 9.359f, 3f, 9.969f)
                lineTo(2.95f, 21.249f)
                horizontalLineTo(2f)
                curveTo(1.59f, 21.249f, 1.25f, 21.579f, 1.25f, 21.999f)
                curveTo(1.25f, 22.409f, 1.59f, 22.749f, 2f, 22.749f)
                horizontalLineTo(22f)
                curveTo(22.41f, 22.749f, 22.75f, 22.409f, 22.75f, 21.999f)
                curveTo(22.75f, 21.579f, 22.41f, 21.249f, 22f, 21.249f)
                close()
                moveTo(10.5f, 6.749f)
                horizontalLineTo(13.5f)
                curveTo(13.91f, 6.749f, 14.25f, 7.089f, 14.25f, 7.499f)
                curveTo(14.25f, 7.909f, 13.91f, 8.249f, 13.5f, 8.249f)
                horizontalLineTo(10.5f)
                curveTo(10.09f, 8.249f, 9.75f, 7.909f, 9.75f, 7.499f)
                curveTo(9.75f, 7.089f, 10.09f, 6.749f, 10.5f, 6.749f)
                close()
                moveTo(17f, 21.249f)
                horizontalLineTo(7f)
                verticalLineTo(12.499f)
                curveTo(7f, 11.669f, 7.67f, 10.999f, 8.5f, 10.999f)
                horizontalLineTo(15.5f)
                curveTo(16.33f, 10.999f, 17f, 11.669f, 17f, 12.499f)
                verticalLineTo(21.249f)
                close()
            }
        }.build()

        return _House2!!
    }

@Suppress("ObjectPropertyName")
private var _House2: ImageVector? = null
