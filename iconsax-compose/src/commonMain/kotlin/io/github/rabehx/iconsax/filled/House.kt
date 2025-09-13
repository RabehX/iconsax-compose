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


val Iconsax.Filled.House: ImageVector
    get() {
        if (_House != null) {
            return _House!!
        }
        _House = ImageVector.Builder(
            name = "Filled.House",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 21.249f)
                horizontalLineTo(21f)
                verticalLineTo(9.979f)
                curveTo(21f, 9.359f, 20.72f, 8.779f, 20.23f, 8.399f)
                lineTo(19f, 7.439f)
                lineTo(18.98f, 4.989f)
                curveTo(18.98f, 4.439f, 18.53f, 3.999f, 17.98f, 3.999f)
                horizontalLineTo(14.57f)
                lineTo(13.23f, 2.959f)
                curveTo(12.51f, 2.389f, 11.49f, 2.389f, 10.77f, 2.959f)
                lineTo(3.77f, 8.399f)
                curveTo(3.28f, 8.779f, 3f, 9.359f, 3f, 9.969f)
                lineTo(2.95f, 21.249f)
                horizontalLineTo(2f)
                curveTo(1.59f, 21.249f, 1.25f, 21.589f, 1.25f, 21.999f)
                curveTo(1.25f, 22.409f, 1.59f, 22.749f, 2f, 22.749f)
                horizontalLineTo(22f)
                curveTo(22.41f, 22.749f, 22.75f, 22.409f, 22.75f, 21.999f)
                curveTo(22.75f, 21.589f, 22.41f, 21.249f, 22f, 21.249f)
                close()
                moveTo(6.5f, 12.749f)
                verticalLineTo(11.249f)
                curveTo(6.5f, 10.699f, 6.95f, 10.249f, 7.5f, 10.249f)
                horizontalLineTo(9.5f)
                curveTo(10.05f, 10.249f, 10.5f, 10.699f, 10.5f, 11.249f)
                verticalLineTo(12.749f)
                curveTo(10.5f, 13.299f, 10.05f, 13.749f, 9.5f, 13.749f)
                horizontalLineTo(7.5f)
                curveTo(6.95f, 13.749f, 6.5f, 13.299f, 6.5f, 12.749f)
                close()
                moveTo(14.5f, 21.249f)
                horizontalLineTo(9.5f)
                verticalLineTo(18.499f)
                curveTo(9.5f, 17.669f, 10.17f, 16.999f, 11f, 16.999f)
                horizontalLineTo(13f)
                curveTo(13.83f, 16.999f, 14.5f, 17.669f, 14.5f, 18.499f)
                verticalLineTo(21.249f)
                close()
                moveTo(17.5f, 12.749f)
                curveTo(17.5f, 13.299f, 17.05f, 13.749f, 16.5f, 13.749f)
                horizontalLineTo(14.5f)
                curveTo(13.95f, 13.749f, 13.5f, 13.299f, 13.5f, 12.749f)
                verticalLineTo(11.249f)
                curveTo(13.5f, 10.699f, 13.95f, 10.249f, 14.5f, 10.249f)
                horizontalLineTo(16.5f)
                curveTo(17.05f, 10.249f, 17.5f, 10.699f, 17.5f, 11.249f)
                verticalLineTo(12.749f)
                close()
            }
        }.build()

        return _House!!
    }

@Suppress("ObjectPropertyName")
private var _House: ImageVector? = null
