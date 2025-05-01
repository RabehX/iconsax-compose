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

val Iconsax.Outline.DiscountCircle: ImageVector
    get() {
        if (_DiscountCircle != null) {
            return _DiscountCircle!!
        }
        _DiscountCircle = ImageVector.Builder(
            name = "Outline.DiscountCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12f)
                curveTo(1.25f, 6.07f, 6.07f, 1.25f, 12f, 1.25f)
                curveTo(17.93f, 1.25f, 22.75f, 6.07f, 22.75f, 12f)
                curveTo(22.75f, 17.93f, 17.93f, 22.75f, 12f, 22.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(6.9f, 2.75f, 2.75f, 6.9f, 2.75f, 12f)
                curveTo(2.75f, 17.1f, 6.9f, 21.25f, 12f, 21.25f)
                curveTo(17.1f, 21.25f, 21.25f, 17.1f, 21.25f, 12f)
                curveTo(21.25f, 6.9f, 17.1f, 2.75f, 12f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 16f)
                curveTo(14.44f, 16f, 13.99f, 15.55f, 13.99f, 15f)
                curveTo(13.99f, 14.45f, 14.44f, 14f, 14.99f, 14f)
                curveTo(15.54f, 14f, 15.99f, 14.45f, 15.99f, 15f)
                curveTo(15.99f, 15.55f, 15.55f, 16f, 15f, 16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.01f, 10f)
                curveTo(8.45f, 10f, 8f, 9.55f, 8f, 9f)
                curveTo(8f, 8.45f, 8.45f, 8f, 9f, 8f)
                curveTo(9.55f, 8f, 10f, 8.45f, 10f, 9f)
                curveTo(10f, 9.55f, 9.56f, 10f, 9.01f, 10f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.999f, 15.75f)
                curveTo(8.809f, 15.75f, 8.619f, 15.68f, 8.469f, 15.53f)
                curveTo(8.179f, 15.24f, 8.179f, 14.76f, 8.469f, 14.47f)
                lineTo(14.469f, 8.47f)
                curveTo(14.759f, 8.18f, 15.24f, 8.18f, 15.53f, 8.47f)
                curveTo(15.819f, 8.76f, 15.819f, 9.24f, 15.53f, 9.53f)
                lineTo(9.53f, 15.53f)
                curveTo(9.38f, 15.68f, 9.189f, 15.75f, 8.999f, 15.75f)
                close()
            }
        }.build()

        return _DiscountCircle!!
    }

@Suppress("ObjectPropertyName")
private var _DiscountCircle: ImageVector? = null
