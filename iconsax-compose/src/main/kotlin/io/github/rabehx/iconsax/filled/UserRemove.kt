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


val Iconsax.Filled.UserRemove: ImageVector
    get() {
        if (_UserRemove != null) {
            return _UserRemove!!
        }
        _UserRemove = ImageVector.Builder(
            name = "Filled.UserRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 14f)
                curveTo(6.99f, 14f, 2.91f, 17.36f, 2.91f, 21.5f)
                curveTo(2.91f, 21.78f, 3.13f, 22f, 3.41f, 22f)
                horizontalLineTo(20.59f)
                curveTo(20.87f, 22f, 21.09f, 21.78f, 21.09f, 21.5f)
                curveTo(21.09f, 17.36f, 17.01f, 14f, 12f, 14f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.851f, 5.798f)
                curveTo(16.731f, 5.308f, 16.531f, 4.828f, 16.251f, 4.388f)
                curveTo(16.061f, 4.068f, 15.811f, 3.748f, 15.541f, 3.468f)
                curveTo(14.641f, 2.568f, 13.471f, 2.078f, 12.271f, 2.018f)
                curveTo(10.911f, 1.928f, 9.521f, 2.428f, 8.471f, 3.468f)
                curveTo(7.481f, 4.448f, 6.981f, 5.758f, 7.001f, 7.078f)
                curveTo(7.011f, 8.328f, 7.511f, 9.578f, 8.461f, 10.538f)
                curveTo(9.121f, 11.198f, 9.931f, 11.638f, 10.801f, 11.838f)
                curveTo(11.271f, 11.958f, 11.771f, 12.018f, 12.271f, 11.978f)
                curveTo(13.461f, 11.928f, 14.621f, 11.458f, 15.531f, 10.538f)
                curveTo(16.821f, 9.248f, 17.261f, 7.438f, 16.851f, 5.798f)
                close()
                moveTo(14.001f, 8.998f)
                curveTo(13.641f, 9.358f, 13.041f, 9.358f, 12.681f, 8.998f)
                lineTo(11.991f, 8.308f)
                lineTo(11.331f, 8.968f)
                curveTo(10.971f, 9.328f, 10.371f, 9.328f, 10.011f, 8.968f)
                curveTo(9.641f, 8.598f, 9.641f, 8.008f, 10.001f, 7.648f)
                lineTo(10.661f, 6.988f)
                lineTo(10.021f, 6.368f)
                curveTo(9.661f, 5.998f, 9.661f, 5.408f, 10.021f, 5.028f)
                curveTo(10.391f, 4.668f, 10.981f, 4.668f, 11.361f, 5.028f)
                lineTo(11.981f, 5.668f)
                lineTo(12.651f, 4.998f)
                curveTo(13.011f, 4.638f, 13.601f, 4.638f, 13.971f, 4.998f)
                curveTo(14.331f, 5.358f, 14.331f, 5.958f, 13.971f, 6.318f)
                lineTo(13.311f, 6.978f)
                lineTo(14.001f, 7.678f)
                curveTo(14.361f, 8.038f, 14.361f, 8.638f, 14.001f, 8.998f)
                close()
            }
        }.build()

        return _UserRemove!!
    }

@Suppress("ObjectPropertyName")
private var _UserRemove: ImageVector? = null
