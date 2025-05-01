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

val Iconsax.Outline.QuoteUp: ImageVector
    get() {
        if (_QuoteUp != null) {
            return _QuoteUp!!
        }
        _QuoteUp = ImageVector.Builder(
            name = "Outline.QuoteUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.8f, 21.47f)
                horizontalLineTo(4.58f)
                curveTo(2.75f, 21.47f, 1.25f, 19.98f, 1.25f, 18.14f)
                verticalLineTo(12.34f)
                curveTo(1.25f, 11.93f, 1.59f, 11.59f, 2f, 11.59f)
                horizontalLineTo(7.8f)
                curveTo(9.7f, 11.59f, 11.13f, 13.02f, 11.13f, 14.92f)
                verticalLineTo(18.14f)
                curveTo(11.12f, 20.04f, 9.69f, 21.47f, 7.8f, 21.47f)
                close()
                moveTo(2.75f, 13.1f)
                verticalLineTo(18.15f)
                curveTo(2.75f, 19.16f, 3.57f, 19.98f, 4.58f, 19.98f)
                horizontalLineTo(7.8f)
                curveTo(8.86f, 19.98f, 9.63f, 19.21f, 9.63f, 18.15f)
                verticalLineTo(14.93f)
                curveTo(9.63f, 13.87f, 8.86f, 13.1f, 7.8f, 13.1f)
                horizontalLineTo(2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2f, 13.1f)
                curveTo(1.59f, 13.1f, 1.25f, 12.76f, 1.25f, 12.35f)
                curveTo(1.25f, 6.1f, 2.52f, 4.79f, 6.15f, 2.64f)
                curveTo(6.51f, 2.43f, 6.97f, 2.55f, 7.18f, 2.9f)
                curveTo(7.39f, 3.26f, 7.27f, 3.72f, 6.92f, 3.93f)
                curveTo(3.68f, 5.85f, 2.75f, 6.65f, 2.75f, 12.35f)
                curveTo(2.75f, 12.76f, 2.41f, 13.1f, 2f, 13.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.421f, 21.47f)
                horizontalLineTo(16.201f)
                curveTo(14.371f, 21.47f, 12.871f, 19.98f, 12.871f, 18.14f)
                verticalLineTo(12.34f)
                curveTo(12.871f, 11.93f, 13.211f, 11.59f, 13.621f, 11.59f)
                horizontalLineTo(19.421f)
                curveTo(21.321f, 11.59f, 22.751f, 13.02f, 22.751f, 14.92f)
                verticalLineTo(18.14f)
                curveTo(22.751f, 20.04f, 21.321f, 21.47f, 19.421f, 21.47f)
                close()
                moveTo(14.381f, 13.1f)
                verticalLineTo(18.15f)
                curveTo(14.381f, 19.16f, 15.201f, 19.98f, 16.211f, 19.98f)
                horizontalLineTo(19.431f)
                curveTo(20.491f, 19.98f, 21.261f, 19.21f, 21.261f, 18.15f)
                verticalLineTo(14.93f)
                curveTo(21.261f, 13.87f, 20.491f, 13.1f, 19.431f, 13.1f)
                horizontalLineTo(14.381f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.629f, 13.1f)
                curveTo(13.219f, 13.1f, 12.879f, 12.76f, 12.879f, 12.35f)
                curveTo(12.879f, 6.1f, 14.149f, 4.79f, 17.779f, 2.64f)
                curveTo(18.139f, 2.43f, 18.599f, 2.55f, 18.809f, 2.9f)
                curveTo(19.019f, 3.26f, 18.899f, 3.72f, 18.549f, 3.93f)
                curveTo(15.309f, 5.85f, 14.379f, 6.65f, 14.379f, 12.35f)
                curveTo(14.379f, 12.76f, 14.039f, 13.1f, 13.629f, 13.1f)
                close()
            }
        }.build()

        return _QuoteUp!!
    }

@Suppress("ObjectPropertyName")
private var _QuoteUp: ImageVector? = null
