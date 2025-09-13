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

val Iconsax.Outline.Flag2: ImageVector
    get() {
        if (_Flag2 != null) {
            return _Flag2!!
        }
        _Flag2 = ImageVector.Builder(
            name = "Outline.Flag2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.449f, 22.75f)
                curveTo(6.039f, 22.75f, 5.699f, 22.41f, 5.699f, 22f)
                verticalLineTo(2f)
                curveTo(5.699f, 1.59f, 6.039f, 1.25f, 6.449f, 1.25f)
                curveTo(6.859f, 1.25f, 7.199f, 1.59f, 7.199f, 2f)
                verticalLineTo(22f)
                curveTo(7.199f, 22.41f, 6.859f, 22.75f, 6.449f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.949f, 17.75f)
                curveTo(6.669f, 17.75f, 6.409f, 17.6f, 6.279f, 17.33f)
                curveTo(6.099f, 16.96f, 6.249f, 16.51f, 6.619f, 16.33f)
                lineTo(14.919f, 12.23f)
                curveTo(16.139f, 11.6f, 16.829f, 10.84f, 16.799f, 10.13f)
                curveTo(16.769f, 9.44f, 16.029f, 8.73f, 14.759f, 8.19f)
                lineTo(6.659f, 4.69f)
                curveTo(6.269f, 4.52f, 6.099f, 4.08f, 6.259f, 3.7f)
                curveTo(6.419f, 3.32f, 6.869f, 3.14f, 7.249f, 3.31f)
                lineTo(15.349f, 6.81f)
                curveTo(17.849f, 7.87f, 18.269f, 9.31f, 18.299f, 10.07f)
                curveTo(18.349f, 11.4f, 17.389f, 12.64f, 15.599f, 13.56f)
                lineTo(7.289f, 17.67f)
                curveTo(7.179f, 17.73f, 7.059f, 17.75f, 6.949f, 17.75f)
                close()
            }
        }.build()

        return _Flag2!!
    }

@Suppress("ObjectPropertyName")
private var _Flag2: ImageVector? = null
