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


val Iconsax.Filled.ProfileDelete: ImageVector
    get() {
        if (_ProfileDelete != null) {
            return _ProfileDelete!!
        }
        _ProfileDelete = ImageVector.Builder(
            name = "Filled.ProfileDelete",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 2f)
                curveTo(9.38f, 2f, 7.25f, 4.13f, 7.25f, 6.75f)
                curveTo(7.25f, 9.32f, 9.26f, 11.4f, 11.88f, 11.49f)
                curveTo(11.96f, 11.48f, 12.04f, 11.48f, 12.1f, 11.49f)
                curveTo(12.12f, 11.49f, 12.13f, 11.49f, 12.15f, 11.49f)
                curveTo(12.16f, 11.49f, 12.16f, 11.49f, 12.17f, 11.49f)
                curveTo(14.73f, 11.4f, 16.74f, 9.32f, 16.75f, 6.75f)
                curveTo(16.75f, 4.13f, 14.62f, 2f, 12f, 2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.081f, 14.149f)
                curveTo(14.291f, 12.289f, 9.741f, 12.289f, 6.931f, 14.149f)
                curveTo(5.661f, 14.999f, 4.961f, 16.149f, 4.961f, 17.379f)
                curveTo(4.961f, 18.609f, 5.661f, 19.749f, 6.921f, 20.589f)
                curveTo(8.321f, 21.529f, 10.161f, 21.999f, 12.001f, 21.999f)
                curveTo(13.841f, 21.999f, 15.681f, 21.529f, 17.081f, 20.589f)
                curveTo(18.341f, 19.739f, 19.041f, 18.599f, 19.041f, 17.359f)
                curveTo(19.031f, 16.129f, 18.341f, 14.989f, 17.081f, 14.149f)
                close()
                moveTo(13.941f, 18.259f)
                curveTo(14.231f, 18.549f, 14.231f, 19.029f, 13.941f, 19.319f)
                curveTo(13.791f, 19.469f, 13.601f, 19.539f, 13.411f, 19.539f)
                curveTo(13.221f, 19.539f, 13.031f, 19.469f, 12.881f, 19.319f)
                lineTo(12.001f, 18.439f)
                lineTo(11.121f, 19.319f)
                curveTo(10.971f, 19.469f, 10.781f, 19.539f, 10.591f, 19.539f)
                curveTo(10.401f, 19.539f, 10.211f, 19.469f, 10.061f, 19.319f)
                curveTo(9.771f, 19.029f, 9.771f, 18.549f, 10.061f, 18.259f)
                lineTo(10.941f, 17.379f)
                lineTo(10.061f, 16.499f)
                curveTo(9.771f, 16.209f, 9.771f, 15.729f, 10.061f, 15.439f)
                curveTo(10.351f, 15.149f, 10.831f, 15.149f, 11.121f, 15.439f)
                lineTo(12.001f, 16.319f)
                lineTo(12.881f, 15.439f)
                curveTo(13.171f, 15.149f, 13.651f, 15.149f, 13.941f, 15.439f)
                curveTo(14.231f, 15.729f, 14.231f, 16.209f, 13.941f, 16.499f)
                lineTo(13.061f, 17.379f)
                lineTo(13.941f, 18.259f)
                close()
            }
        }.build()

        return _ProfileDelete!!
    }

@Suppress("ObjectPropertyName")
private var _ProfileDelete: ImageVector? = null
