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


val Iconsax.Filled.Gift: ImageVector
    get() {
        if (_Gift != null) {
            return _Gift!!
        }
        _Gift = ImageVector.Builder(
            name = "Filled.Gift",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 12f)
                verticalLineTo(18f)
                curveTo(20f, 20.21f, 18.21f, 22f, 16f, 22f)
                horizontalLineTo(8f)
                curveTo(5.79f, 22f, 4f, 20.21f, 4f, 18f)
                verticalLineTo(12f)
                curveTo(4f, 11.45f, 4.45f, 11f, 5f, 11f)
                horizontalLineTo(6.97f)
                curveTo(7.52f, 11f, 7.97f, 11.45f, 7.97f, 12f)
                verticalLineTo(15.14f)
                curveTo(7.97f, 15.88f, 8.38f, 16.56f, 9.03f, 16.91f)
                curveTo(9.32f, 17.07f, 9.64f, 17.15f, 9.97f, 17.15f)
                curveTo(10.35f, 17.15f, 10.73f, 17.04f, 11.06f, 16.82f)
                lineTo(12.01f, 16.2f)
                lineTo(12.89f, 16.79f)
                curveTo(13.5f, 17.2f, 14.28f, 17.25f, 14.93f, 16.9f)
                curveTo(15.59f, 16.55f, 16f, 15.88f, 16f, 15.13f)
                verticalLineTo(12f)
                curveTo(16f, 11.45f, 16.45f, 11f, 17f, 11f)
                horizontalLineTo(19f)
                curveTo(19.55f, 11f, 20f, 11.45f, 20f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.5f, 7f)
                verticalLineTo(8f)
                curveTo(21.5f, 9.1f, 20.97f, 10f, 19.5f, 10f)
                horizontalLineTo(4.5f)
                curveTo(2.97f, 10f, 2.5f, 9.1f, 2.5f, 8f)
                verticalLineTo(7f)
                curveTo(2.5f, 5.9f, 2.97f, 5f, 4.5f, 5f)
                horizontalLineTo(19.5f)
                curveTo(20.97f, 5f, 21.5f, 5.9f, 21.5f, 7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.639f, 5.001f)
                horizontalLineTo(6.119f)
                curveTo(5.779f, 4.631f, 5.789f, 4.061f, 6.149f, 3.701f)
                lineTo(7.569f, 2.281f)
                curveTo(7.939f, 1.911f, 8.549f, 1.911f, 8.919f, 2.281f)
                lineTo(11.639f, 5.001f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.872f, 5.001f)
                horizontalLineTo(12.352f)
                lineTo(15.072f, 2.281f)
                curveTo(15.442f, 1.911f, 16.052f, 1.911f, 16.422f, 2.281f)
                lineTo(17.842f, 3.701f)
                curveTo(18.202f, 4.061f, 18.212f, 4.631f, 17.872f, 5.001f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.971f, 11f)
                curveTo(14.521f, 11f, 14.971f, 11.45f, 14.971f, 12f)
                verticalLineTo(15.13f)
                curveTo(14.971f, 15.93f, 14.081f, 16.41f, 13.421f, 15.96f)
                lineTo(12.521f, 15.36f)
                curveTo(12.191f, 15.14f, 11.761f, 15.14f, 11.421f, 15.36f)
                lineTo(10.481f, 15.98f)
                curveTo(9.821f, 16.42f, 8.941f, 15.94f, 8.941f, 15.15f)
                verticalLineTo(12f)
                curveTo(8.941f, 11.45f, 9.391f, 11f, 9.941f, 11f)
                horizontalLineTo(13.971f)
                close()
            }
        }.build()

        return _Gift!!
    }

@Suppress("ObjectPropertyName")
private var _Gift: ImageVector? = null
