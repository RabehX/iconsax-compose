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

val Iconsax.Outline.Convert: ImageVector
    get() {
        if (_Convert != null) {
            return _Convert!!
        }
        _Convert = ImageVector.Builder(
            name = "Outline.Convert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.005f, 22.733f)
                curveTo(6.087f, 22.733f, 1.277f, 17.923f, 1.277f, 12.005f)
                curveTo(1.277f, 6.087f, 6.087f, 1.277f, 12.005f, 1.277f)
                curveTo(17.923f, 1.277f, 22.733f, 6.087f, 22.733f, 12.005f)
                curveTo(22.733f, 17.923f, 17.913f, 22.733f, 12.005f, 22.733f)
                close()
                moveTo(12.005f, 2.774f)
                curveTo(6.916f, 2.774f, 2.774f, 6.916f, 2.774f, 12.005f)
                curveTo(2.774f, 17.094f, 6.916f, 21.236f, 12.005f, 21.236f)
                curveTo(17.094f, 21.236f, 21.236f, 17.094f, 21.236f, 12.005f)
                curveTo(21.236f, 6.916f, 17.094f, 2.774f, 12.005f, 2.774f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.3f, 12.953f)
                curveTo(14.1f, 12.953f, 13.91f, 12.873f, 13.771f, 12.734f)
                lineTo(5.608f, 4.551f)
                curveTo(5.318f, 4.261f, 5.318f, 3.782f, 5.608f, 3.493f)
                curveTo(5.897f, 3.204f, 6.376f, 3.204f, 6.665f, 3.493f)
                lineTo(13.561f, 10.399f)
                lineTo(13.571f, 7.664f)
                curveTo(13.571f, 7.255f, 13.91f, 6.916f, 14.319f, 6.916f)
                curveTo(14.729f, 6.886f, 15.068f, 7.255f, 15.068f, 7.664f)
                lineTo(15.058f, 12.205f)
                curveTo(15.058f, 12.504f, 14.878f, 12.784f, 14.599f, 12.893f)
                curveTo(14.499f, 12.933f, 14.399f, 12.953f, 14.3f, 12.953f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.863f, 20.727f)
                curveTo(17.673f, 20.727f, 17.484f, 20.657f, 17.334f, 20.507f)
                lineTo(10.439f, 13.601f)
                lineTo(10.429f, 16.336f)
                curveTo(10.429f, 16.745f, 10.089f, 17.084f, 9.68f, 17.084f)
                curveTo(9.271f, 17.084f, 8.932f, 16.745f, 8.932f, 16.336f)
                lineTo(8.942f, 11.795f)
                curveTo(8.942f, 11.496f, 9.121f, 11.217f, 9.401f, 11.107f)
                curveTo(9.68f, 10.987f, 9.999f, 11.057f, 10.219f, 11.266f)
                lineTo(18.382f, 19.449f)
                curveTo(18.671f, 19.739f, 18.671f, 20.218f, 18.382f, 20.507f)
                curveTo(18.252f, 20.657f, 18.053f, 20.727f, 17.863f, 20.727f)
                close()
            }
        }.build()

        return _Convert!!
    }

@Suppress("ObjectPropertyName")
private var _Convert: ImageVector? = null
