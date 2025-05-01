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


val Iconsax.Filled.UserTag: ImageVector
    get() {
        if (_UserTag != null) {
            return _UserTag!!
        }
        _UserTag = ImageVector.Builder(
            name = "Filled.UserTag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 2f)
                horizontalLineTo(6f)
                curveTo(4.34f, 2f, 3f, 3.33f, 3f, 4.97f)
                verticalLineTo(15.88f)
                curveTo(3f, 17.52f, 4.34f, 18.85f, 6f, 18.85f)
                horizontalLineTo(6.76f)
                curveTo(7.56f, 18.85f, 8.32f, 19.16f, 8.88f, 19.72f)
                lineTo(10.59f, 21.41f)
                curveTo(11.37f, 22.18f, 12.64f, 22.18f, 13.42f, 21.41f)
                lineTo(15.13f, 19.72f)
                curveTo(15.69f, 19.16f, 16.46f, 18.85f, 17.25f, 18.85f)
                horizontalLineTo(18f)
                curveTo(19.66f, 18.85f, 21f, 17.52f, 21f, 15.88f)
                verticalLineTo(4.97f)
                curveTo(21f, 3.33f, 19.66f, 2f, 18f, 2f)
                close()
                moveTo(12f, 5.75f)
                curveTo(13.29f, 5.75f, 14.33f, 6.79f, 14.33f, 8.08f)
                curveTo(14.33f, 9.37f, 13.29f, 10.41f, 12f, 10.41f)
                curveTo(10.71f, 10.41f, 9.67f, 9.36f, 9.67f, 8.08f)
                curveTo(9.67f, 6.79f, 10.71f, 5.75f, 12f, 5.75f)
                close()
                moveTo(14.68f, 15.06f)
                horizontalLineTo(9.32f)
                curveTo(8.51f, 15.06f, 8.04f, 14.16f, 8.49f, 13.49f)
                curveTo(9.17f, 12.48f, 10.49f, 11.8f, 12f, 11.8f)
                curveTo(13.51f, 11.8f, 14.83f, 12.48f, 15.51f, 13.49f)
                curveTo(15.96f, 14.16f, 15.48f, 15.06f, 14.68f, 15.06f)
                close()
            }
        }.build()

        return _UserTag!!
    }

@Suppress("ObjectPropertyName")
private var _UserTag: ImageVector? = null
