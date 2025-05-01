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


val Iconsax.Filled.DollarCircle: ImageVector
    get() {
        if (_DollarCircle != null) {
            return _DollarCircle!!
        }
        _DollarCircle = ImageVector.Builder(
            name = "Filled.DollarCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.75f, 15.92f)
                horizontalLineTo(13.4f)
                curveTo(14.05f, 15.92f, 14.59f, 15.34f, 14.59f, 14.64f)
                curveTo(14.59f, 13.77f, 14.28f, 13.6f, 13.77f, 13.42f)
                lineTo(12.76f, 13.07f)
                verticalLineTo(15.92f)
                horizontalLineTo(12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.97f, 1.898f)
                curveTo(6.45f, 1.918f, 1.98f, 6.408f, 2f, 11.929f)
                curveTo(2.02f, 17.448f, 6.51f, 21.919f, 12.03f, 21.899f)
                curveTo(17.55f, 21.878f, 22.02f, 17.389f, 22f, 11.868f)
                curveTo(21.98f, 6.348f, 17.49f, 1.888f, 11.97f, 1.898f)
                close()
                moveTo(14.26f, 11.998f)
                curveTo(15.04f, 12.269f, 16.09f, 12.849f, 16.09f, 14.639f)
                curveTo(16.09f, 16.178f, 14.88f, 17.419f, 13.4f, 17.419f)
                horizontalLineTo(12.75f)
                verticalLineTo(17.999f)
                curveTo(12.75f, 18.409f, 12.41f, 18.749f, 12f, 18.749f)
                curveTo(11.59f, 18.749f, 11.25f, 18.409f, 11.25f, 17.999f)
                verticalLineTo(17.419f)
                horizontalLineTo(10.89f)
                curveTo(9.25f, 17.419f, 7.92f, 16.038f, 7.92f, 14.339f)
                curveTo(7.92f, 13.929f, 8.26f, 13.589f, 8.67f, 13.589f)
                curveTo(9.08f, 13.589f, 9.42f, 13.929f, 9.42f, 14.339f)
                curveTo(9.42f, 15.208f, 10.08f, 15.918f, 10.89f, 15.918f)
                horizontalLineTo(11.25f)
                verticalLineTo(12.538f)
                lineTo(9.74f, 11.998f)
                curveTo(8.96f, 11.729f, 7.91f, 11.149f, 7.91f, 9.358f)
                curveTo(7.91f, 7.818f, 9.12f, 6.578f, 10.6f, 6.578f)
                horizontalLineTo(11.25f)
                verticalLineTo(5.998f)
                curveTo(11.25f, 5.588f, 11.59f, 5.248f, 12f, 5.248f)
                curveTo(12.41f, 5.248f, 12.75f, 5.588f, 12.75f, 5.998f)
                verticalLineTo(6.578f)
                horizontalLineTo(13.11f)
                curveTo(14.75f, 6.578f, 16.08f, 7.958f, 16.08f, 9.658f)
                curveTo(16.08f, 10.068f, 15.74f, 10.408f, 15.33f, 10.408f)
                curveTo(14.92f, 10.408f, 14.58f, 10.068f, 14.58f, 9.658f)
                curveTo(14.58f, 8.788f, 13.92f, 8.078f, 13.11f, 8.078f)
                horizontalLineTo(12.75f)
                verticalLineTo(11.458f)
                lineTo(14.26f, 11.998f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.422f, 9.368f)
                curveTo(9.422f, 10.238f, 9.732f, 10.408f, 10.242f, 10.588f)
                lineTo(11.252f, 10.938f)
                verticalLineTo(8.078f)
                horizontalLineTo(10.602f)
                curveTo(9.952f, 8.078f, 9.422f, 8.658f, 9.422f, 9.368f)
                close()
            }
        }.build()

        return _DollarCircle!!
    }

@Suppress("ObjectPropertyName")
private var _DollarCircle: ImageVector? = null
