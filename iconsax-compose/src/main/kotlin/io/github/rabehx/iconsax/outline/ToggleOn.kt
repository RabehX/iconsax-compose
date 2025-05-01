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

val Iconsax.Outline.ToggleOn: ImageVector
    get() {
        if (_ToggleOn != null) {
            return _ToggleOn!!
        }
        _ToggleOn = ImageVector.Builder(
            name = "Outline.ToggleOn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.7f, 16.75f)
                horizontalLineTo(13.3f)
                curveTo(10.88f, 16.75f, 9.75f, 15.62f, 9.75f, 13.2f)
                verticalLineTo(10.8f)
                curveTo(9.75f, 8.38f, 10.88f, 7.25f, 13.3f, 7.25f)
                horizontalLineTo(15.7f)
                curveTo(18.12f, 7.25f, 19.25f, 8.38f, 19.25f, 10.8f)
                verticalLineTo(13.2f)
                curveTo(19.25f, 15.62f, 18.12f, 16.75f, 15.7f, 16.75f)
                close()
                moveTo(13.3f, 8.75f)
                curveTo(11.71f, 8.75f, 11.25f, 9.21f, 11.25f, 10.8f)
                verticalLineTo(13.2f)
                curveTo(11.25f, 14.79f, 11.71f, 15.25f, 13.3f, 15.25f)
                horizontalLineTo(15.7f)
                curveTo(17.29f, 15.25f, 17.75f, 14.79f, 17.75f, 13.2f)
                verticalLineTo(10.8f)
                curveTo(17.75f, 9.21f, 17.29f, 8.75f, 15.7f, 8.75f)
                horizontalLineTo(13.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 20.75f)
                horizontalLineTo(7f)
                curveTo(2.59f, 20.75f, 1.25f, 19.41f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 4.59f, 2.59f, 3.25f, 7f, 3.25f)
                horizontalLineTo(17f)
                curveTo(21.41f, 3.25f, 22.75f, 4.59f, 22.75f, 9f)
                verticalLineTo(15f)
                curveTo(22.75f, 19.41f, 21.41f, 20.75f, 17f, 20.75f)
                close()
                moveTo(7f, 4.75f)
                curveTo(3.42f, 4.75f, 2.75f, 5.43f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 18.57f, 3.42f, 19.25f, 7f, 19.25f)
                horizontalLineTo(17f)
                curveTo(20.58f, 19.25f, 21.25f, 18.57f, 21.25f, 15f)
                verticalLineTo(9f)
                curveTo(21.25f, 5.43f, 20.58f, 4.75f, 17f, 4.75f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _ToggleOn!!
    }

@Suppress("ObjectPropertyName")
private var _ToggleOn: ImageVector? = null
