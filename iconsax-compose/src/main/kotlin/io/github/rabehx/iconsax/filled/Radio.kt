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


val Iconsax.Filled.Radio: ImageVector
    get() {
        if (_Radio != null) {
            return _Radio!!
        }
        _Radio = ImageVector.Builder(
            name = "Filled.Radio",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.75f, 2f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                curveTo(6.74f, 5f, 6.49f, 5.01f, 6.25f, 5.05f)
                verticalLineTo(2f)
                curveTo(6.25f, 1.59f, 6.59f, 1.25f, 7f, 1.25f)
                curveTo(7.41f, 1.25f, 7.75f, 1.59f, 7.75f, 2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 5f)
                horizontalLineTo(7f)
                curveTo(6.74f, 5f, 6.49f, 5.01f, 6.25f, 5.05f)
                curveTo(3.67f, 5.35f, 2f, 7.26f, 2f, 10f)
                verticalLineTo(17f)
                curveTo(2f, 20f, 4f, 22f, 7f, 22f)
                horizontalLineTo(17f)
                curveTo(20f, 22f, 22f, 20f, 22f, 17f)
                verticalLineTo(10f)
                curveTo(22f, 7f, 20f, 5f, 17f, 5f)
                close()
                moveTo(7.88f, 16f)
                curveTo(6.5f, 16f, 5.38f, 14.88f, 5.38f, 13.5f)
                curveTo(5.38f, 12.12f, 6.5f, 11f, 7.88f, 11f)
                curveTo(9.26f, 11f, 10.38f, 12.12f, 10.38f, 13.5f)
                curveTo(10.38f, 14.88f, 9.26f, 16f, 7.88f, 16f)
                close()
                moveTo(14.38f, 16.25f)
                horizontalLineTo(13.88f)
                curveTo(13.47f, 16.25f, 13.13f, 15.91f, 13.13f, 15.5f)
                curveTo(13.13f, 15.09f, 13.47f, 14.75f, 13.88f, 14.75f)
                horizontalLineTo(14.38f)
                curveTo(14.79f, 14.75f, 15.13f, 15.09f, 15.13f, 15.5f)
                curveTo(15.13f, 15.91f, 14.79f, 16.25f, 14.38f, 16.25f)
                close()
                moveTo(17.88f, 16.25f)
                horizontalLineTo(17.38f)
                curveTo(16.97f, 16.25f, 16.63f, 15.91f, 16.63f, 15.5f)
                curveTo(16.63f, 15.09f, 16.97f, 14.75f, 17.38f, 14.75f)
                horizontalLineTo(17.88f)
                curveTo(18.29f, 14.75f, 18.63f, 15.09f, 18.63f, 15.5f)
                curveTo(18.63f, 15.91f, 18.29f, 16.25f, 17.88f, 16.25f)
                close()
                moveTo(17.88f, 12.25f)
                horizontalLineTo(13.88f)
                curveTo(13.47f, 12.25f, 13.13f, 11.91f, 13.13f, 11.5f)
                curveTo(13.13f, 11.09f, 13.47f, 10.75f, 13.88f, 10.75f)
                horizontalLineTo(17.88f)
                curveTo(18.29f, 10.75f, 18.63f, 11.09f, 18.63f, 11.5f)
                curveTo(18.63f, 11.91f, 18.29f, 12.25f, 17.88f, 12.25f)
                close()
            }
        }.build()

        return _Radio!!
    }

@Suppress("ObjectPropertyName")
private var _Radio: ImageVector? = null
