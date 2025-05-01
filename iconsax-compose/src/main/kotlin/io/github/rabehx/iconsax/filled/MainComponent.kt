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


val Iconsax.Filled.MainComponent: ImageVector
    get() {
        if (_MainComponent != null) {
            return _MainComponent!!
        }
        _MainComponent = ImageVector.Builder(
            name = "Filled.MainComponent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.51f, 5.01f)
                lineTo(14.55f, 3.05f)
                curveTo(13.15f, 1.65f, 10.85f, 1.65f, 9.45f, 3.05f)
                lineTo(7.49f, 5.01f)
                curveTo(7.1f, 5.4f, 7.1f, 6.04f, 7.49f, 6.43f)
                lineTo(11.3f, 10.24f)
                curveTo(11.69f, 10.63f, 12.32f, 10.63f, 12.71f, 10.24f)
                lineTo(16.52f, 6.43f)
                curveTo(16.9f, 6.04f, 16.9f, 5.4f, 16.51f, 5.01f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.01f, 7.492f)
                lineTo(3.05f, 9.452f)
                curveTo(1.65f, 10.852f, 1.65f, 13.152f, 3.05f, 14.552f)
                lineTo(5.01f, 16.512f)
                curveTo(5.4f, 16.902f, 6.03f, 16.902f, 6.42f, 16.512f)
                lineTo(10.23f, 12.702f)
                curveTo(10.62f, 12.312f, 10.62f, 11.682f, 10.23f, 11.292f)
                lineTo(6.43f, 7.492f)
                curveTo(6.04f, 7.102f, 5.4f, 7.102f, 5.01f, 7.492f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.949f, 9.452f)
                lineTo(18.989f, 7.492f)
                curveTo(18.599f, 7.102f, 17.969f, 7.102f, 17.579f, 7.492f)
                lineTo(13.769f, 11.302f)
                curveTo(13.379f, 11.692f, 13.379f, 12.322f, 13.769f, 12.712f)
                lineTo(17.579f, 16.522f)
                curveTo(17.969f, 16.912f, 18.599f, 16.912f, 18.989f, 16.522f)
                lineTo(20.949f, 14.562f)
                curveTo(22.349f, 13.152f, 22.349f, 10.852f, 20.949f, 9.452f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.489f, 18.989f)
                lineTo(9.449f, 20.949f)
                curveTo(10.849f, 22.349f, 13.149f, 22.349f, 14.549f, 20.949f)
                lineTo(16.509f, 18.989f)
                curveTo(16.899f, 18.599f, 16.899f, 17.969f, 16.509f, 17.579f)
                lineTo(12.699f, 13.769f)
                curveTo(12.309f, 13.379f, 11.679f, 13.379f, 11.289f, 13.769f)
                lineTo(7.479f, 17.579f)
                curveTo(7.099f, 17.959f, 7.099f, 18.599f, 7.489f, 18.989f)
                close()
            }
        }.build()

        return _MainComponent!!
    }

@Suppress("ObjectPropertyName")
private var _MainComponent: ImageVector? = null
