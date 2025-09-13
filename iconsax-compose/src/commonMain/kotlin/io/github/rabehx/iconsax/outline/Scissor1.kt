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

val Iconsax.Outline.Scissor1: ImageVector
    get() {
        if (_Scissor1 != null) {
            return _Scissor1!!
        }
        _Scissor1 = ImageVector.Builder(
            name = "Outline.Scissor1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.5f, 10.75f)
                curveTo(3.16f, 10.75f, 1.25f, 8.84f, 1.25f, 6.5f)
                curveTo(1.25f, 4.16f, 3.16f, 2.25f, 5.5f, 2.25f)
                curveTo(7.84f, 2.25f, 9.75f, 4.16f, 9.75f, 6.5f)
                curveTo(9.75f, 8.84f, 7.84f, 10.75f, 5.5f, 10.75f)
                close()
                moveTo(5.5f, 3.75f)
                curveTo(3.98f, 3.75f, 2.75f, 4.98f, 2.75f, 6.5f)
                curveTo(2.75f, 8.02f, 3.98f, 9.25f, 5.5f, 9.25f)
                curveTo(7.02f, 9.25f, 8.25f, 8.02f, 8.25f, 6.5f)
                curveTo(8.25f, 4.98f, 7.02f, 3.75f, 5.5f, 3.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.5f, 21.75f)
                curveTo(3.16f, 21.75f, 1.25f, 19.84f, 1.25f, 17.5f)
                curveTo(1.25f, 15.16f, 3.16f, 13.25f, 5.5f, 13.25f)
                curveTo(7.84f, 13.25f, 9.75f, 15.16f, 9.75f, 17.5f)
                curveTo(9.75f, 19.84f, 7.84f, 21.75f, 5.5f, 21.75f)
                close()
                moveTo(5.5f, 14.75f)
                curveTo(3.98f, 14.75f, 2.75f, 15.98f, 2.75f, 17.5f)
                curveTo(2.75f, 19.02f, 3.98f, 20.25f, 5.5f, 20.25f)
                curveTo(7.02f, 20.25f, 8.25f, 19.02f, 8.25f, 17.5f)
                curveTo(8.25f, 15.98f, 7.02f, 14.75f, 5.5f, 14.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.651f, 16.73f)
                curveTo(8.421f, 16.73f, 8.201f, 16.63f, 8.051f, 16.43f)
                curveTo(7.801f, 16.1f, 7.871f, 15.63f, 8.201f, 15.38f)
                lineTo(21.551f, 5.4f)
                curveTo(21.881f, 5.15f, 22.351f, 5.22f, 22.601f, 5.55f)
                curveTo(22.851f, 5.88f, 22.781f, 6.35f, 22.451f, 6.6f)
                lineTo(9.101f, 16.58f)
                curveTo(8.971f, 16.68f, 8.811f, 16.73f, 8.651f, 16.73f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22.001f, 18.72f)
                curveTo(21.841f, 18.72f, 21.691f, 18.67f, 21.551f, 18.57f)
                lineTo(8.201f, 8.59f)
                curveTo(7.871f, 8.34f, 7.801f, 7.87f, 8.051f, 7.54f)
                curveTo(8.301f, 7.21f, 8.771f, 7.14f, 9.101f, 7.39f)
                lineTo(22.451f, 17.37f)
                curveTo(22.781f, 17.62f, 22.851f, 18.09f, 22.601f, 18.42f)
                curveTo(22.451f, 18.61f, 22.231f, 18.72f, 22.001f, 18.72f)
                close()
            }
        }.build()

        return _Scissor1!!
    }

@Suppress("ObjectPropertyName")
private var _Scissor1: ImageVector? = null
