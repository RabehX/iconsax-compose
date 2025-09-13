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


val Iconsax.Filled.Card: ImageVector
    get() {
        if (_Card != null) {
            return _Card!!
        }
        _Card = ImageVector.Builder(
            name = "Filled.Card",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 7.548f)
                curveTo(22f, 8.208f, 21.46f, 8.748f, 20.8f, 8.748f)
                horizontalLineTo(3.2f)
                curveTo(2.54f, 8.748f, 2f, 8.208f, 2f, 7.548f)
                verticalLineTo(7.538f)
                curveTo(2f, 5.248f, 3.85f, 3.398f, 6.14f, 3.398f)
                horizontalLineTo(17.85f)
                curveTo(20.14f, 3.398f, 22f, 5.258f, 22f, 7.548f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2f, 11.45f)
                verticalLineTo(16.46f)
                curveTo(2f, 18.75f, 3.85f, 20.6f, 6.14f, 20.6f)
                horizontalLineTo(17.85f)
                curveTo(20.14f, 20.6f, 22f, 18.74f, 22f, 16.45f)
                verticalLineTo(11.45f)
                curveTo(22f, 10.79f, 21.46f, 10.25f, 20.8f, 10.25f)
                horizontalLineTo(3.2f)
                curveTo(2.54f, 10.25f, 2f, 10.79f, 2f, 11.45f)
                close()
                moveTo(8f, 17.25f)
                horizontalLineTo(6f)
                curveTo(5.59f, 17.25f, 5.25f, 16.91f, 5.25f, 16.5f)
                curveTo(5.25f, 16.09f, 5.59f, 15.75f, 6f, 15.75f)
                horizontalLineTo(8f)
                curveTo(8.41f, 15.75f, 8.75f, 16.09f, 8.75f, 16.5f)
                curveTo(8.75f, 16.91f, 8.41f, 17.25f, 8f, 17.25f)
                close()
                moveTo(14.5f, 17.25f)
                horizontalLineTo(10.5f)
                curveTo(10.09f, 17.25f, 9.75f, 16.91f, 9.75f, 16.5f)
                curveTo(9.75f, 16.09f, 10.09f, 15.75f, 10.5f, 15.75f)
                horizontalLineTo(14.5f)
                curveTo(14.91f, 15.75f, 15.25f, 16.09f, 15.25f, 16.5f)
                curveTo(15.25f, 16.91f, 14.91f, 17.25f, 14.5f, 17.25f)
                close()
            }
        }.build()

        return _Card!!
    }

@Suppress("ObjectPropertyName")
private var _Card: ImageVector? = null
