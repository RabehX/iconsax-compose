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

val Iconsax.Outline.Unlock: ImageVector
    get() {
        if (_Unlock != null) {
            return _Unlock!!
        }
        _Unlock = ImageVector.Builder(
            name = "Outline.Unlock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 22.75f)
                horizontalLineTo(7f)
                curveTo(2.59f, 22.75f, 1.25f, 21.41f, 1.25f, 17f)
                verticalLineTo(15f)
                curveTo(1.25f, 10.59f, 2.59f, 9.25f, 7f, 9.25f)
                horizontalLineTo(17f)
                curveTo(21.41f, 9.25f, 22.75f, 10.59f, 22.75f, 15f)
                verticalLineTo(17f)
                curveTo(22.75f, 21.41f, 21.41f, 22.75f, 17f, 22.75f)
                close()
                moveTo(7f, 10.75f)
                curveTo(3.42f, 10.75f, 2.75f, 11.43f, 2.75f, 15f)
                verticalLineTo(17f)
                curveTo(2.75f, 20.57f, 3.42f, 21.25f, 7f, 21.25f)
                horizontalLineTo(17f)
                curveTo(20.58f, 21.25f, 21.25f, 20.57f, 21.25f, 17f)
                verticalLineTo(15f)
                curveTo(21.25f, 11.43f, 20.58f, 10.75f, 17f, 10.75f)
                horizontalLineTo(7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6f, 10.75f)
                curveTo(5.59f, 10.75f, 5.25f, 10.41f, 5.25f, 10f)
                verticalLineTo(8f)
                curveTo(5.25f, 5.1f, 5.95f, 1.25f, 12f, 1.25f)
                curveTo(16.48f, 1.25f, 18.75f, 3.18f, 18.75f, 7f)
                curveTo(18.75f, 7.41f, 18.41f, 7.75f, 18f, 7.75f)
                curveTo(17.59f, 7.75f, 17.25f, 7.41f, 17.25f, 7f)
                curveTo(17.25f, 5.02f, 16.65f, 2.75f, 12f, 2.75f)
                curveTo(7.64f, 2.75f, 6.75f, 4.85f, 6.75f, 8f)
                verticalLineTo(10f)
                curveTo(6.75f, 10.41f, 6.41f, 10.75f, 6f, 10.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 19.25f)
                curveTo(10.21f, 19.25f, 8.75f, 17.79f, 8.75f, 16f)
                curveTo(8.75f, 14.21f, 10.21f, 12.75f, 12f, 12.75f)
                curveTo(13.79f, 12.75f, 15.25f, 14.21f, 15.25f, 16f)
                curveTo(15.25f, 17.79f, 13.79f, 19.25f, 12f, 19.25f)
                close()
                moveTo(12f, 14.25f)
                curveTo(11.04f, 14.25f, 10.25f, 15.04f, 10.25f, 16f)
                curveTo(10.25f, 16.96f, 11.04f, 17.75f, 12f, 17.75f)
                curveTo(12.96f, 17.75f, 13.75f, 16.96f, 13.75f, 16f)
                curveTo(13.75f, 15.04f, 12.96f, 14.25f, 12f, 14.25f)
                close()
            }
        }.build()

        return _Unlock!!
    }

@Suppress("ObjectPropertyName")
private var _Unlock: ImageVector? = null
