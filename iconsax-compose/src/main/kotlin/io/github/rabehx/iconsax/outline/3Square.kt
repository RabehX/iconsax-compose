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

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.ThreeSquare: ImageVector
    get() {
        if (_3Square != null) {
            return _3Square!!
        }
        _3Square = ImageVector.Builder(
            name = "Outline.3Square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.37f, 22.75f)
                horizontalLineTo(4.62f)
                curveTo(2.32f, 22.75f, 1.25f, 21.68f, 1.25f, 19.38f)
                verticalLineTo(14.63f)
                curveTo(1.25f, 12.32f, 2.32f, 11.25f, 4.62f, 11.25f)
                horizontalLineTo(7f)
                curveTo(7.41f, 11.25f, 7.75f, 11.59f, 7.75f, 12f)
                verticalLineTo(14.37f)
                curveTo(7.75f, 15.83f, 8.17f, 16.25f, 9.62f, 16.25f)
                horizontalLineTo(12f)
                curveTo(12.41f, 16.25f, 12.75f, 16.59f, 12.75f, 17f)
                verticalLineTo(19.38f)
                curveTo(12.75f, 21.68f, 11.68f, 22.75f, 9.37f, 22.75f)
                close()
                moveTo(4.62f, 12.75f)
                curveTo(3.17f, 12.75f, 2.75f, 13.17f, 2.75f, 14.63f)
                verticalLineTo(19.38f)
                curveTo(2.75f, 20.83f, 3.17f, 21.25f, 4.62f, 21.25f)
                horizontalLineTo(9.37f)
                curveTo(10.83f, 21.25f, 11.25f, 20.83f, 11.25f, 19.38f)
                verticalLineTo(17.75f)
                horizontalLineTo(9.62f)
                curveTo(7.32f, 17.75f, 6.25f, 16.68f, 6.25f, 14.37f)
                verticalLineTo(12.75f)
                horizontalLineTo(4.62f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.37f, 17.75f)
                horizontalLineTo(9.62f)
                curveTo(7.32f, 17.75f, 6.25f, 16.68f, 6.25f, 14.37f)
                verticalLineTo(9.62f)
                curveTo(6.25f, 7.32f, 7.32f, 6.25f, 9.62f, 6.25f)
                horizontalLineTo(12f)
                curveTo(12.41f, 6.25f, 12.75f, 6.59f, 12.75f, 7f)
                verticalLineTo(9.37f)
                curveTo(12.75f, 10.83f, 13.17f, 11.25f, 14.62f, 11.25f)
                horizontalLineTo(17f)
                curveTo(17.41f, 11.25f, 17.75f, 11.59f, 17.75f, 12f)
                verticalLineTo(14.37f)
                curveTo(17.75f, 16.68f, 16.68f, 17.75f, 14.37f, 17.75f)
                close()
                moveTo(9.62f, 7.75f)
                curveTo(8.17f, 7.75f, 7.75f, 8.17f, 7.75f, 9.62f)
                verticalLineTo(14.37f)
                curveTo(7.75f, 15.83f, 8.17f, 16.25f, 9.62f, 16.25f)
                horizontalLineTo(14.37f)
                curveTo(15.83f, 16.25f, 16.25f, 15.83f, 16.25f, 14.37f)
                verticalLineTo(12.75f)
                horizontalLineTo(14.62f)
                curveTo(12.32f, 12.75f, 11.25f, 11.68f, 11.25f, 9.37f)
                verticalLineTo(7.75f)
                horizontalLineTo(9.62f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.37f, 12.75f)
                horizontalLineTo(14.62f)
                curveTo(12.32f, 12.75f, 11.25f, 11.68f, 11.25f, 9.37f)
                verticalLineTo(4.62f)
                curveTo(11.25f, 2.32f, 12.32f, 1.25f, 14.62f, 1.25f)
                horizontalLineTo(19.37f)
                curveTo(21.68f, 1.25f, 22.75f, 2.32f, 22.75f, 4.62f)
                verticalLineTo(9.37f)
                curveTo(22.75f, 11.68f, 21.68f, 12.75f, 19.37f, 12.75f)
                close()
                moveTo(14.62f, 2.75f)
                curveTo(13.17f, 2.75f, 12.75f, 3.17f, 12.75f, 4.62f)
                verticalLineTo(9.37f)
                curveTo(12.75f, 10.83f, 13.17f, 11.25f, 14.62f, 11.25f)
                horizontalLineTo(19.37f)
                curveTo(20.83f, 11.25f, 21.25f, 10.83f, 21.25f, 9.37f)
                verticalLineTo(4.62f)
                curveTo(21.25f, 3.17f, 20.83f, 2.75f, 19.37f, 2.75f)
                horizontalLineTo(14.62f)
                close()
            }
        }.build()

        return _3Square!!
    }

@Suppress("ObjectPropertyName")
private var _3Square: ImageVector? = null
