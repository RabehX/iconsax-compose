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


val Iconsax.Filled.QuoteUp: ImageVector
    get() {
        if (_QuoteUp != null) {
            return _QuoteUp!!
        }
        _QuoteUp = ImageVector.Builder(
            name = "Filled.QuoteUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.09f, 11.631f)
                horizontalLineTo(3.4f)
                curveTo(3.48f, 6.961f, 4.4f, 6.191f, 7.27f, 4.491f)
                curveTo(7.6f, 4.291f, 7.71f, 3.871f, 7.51f, 3.531f)
                curveTo(7.32f, 3.201f, 6.89f, 3.091f, 6.56f, 3.291f)
                curveTo(3.18f, 5.291f, 2f, 6.511f, 2f, 12.321f)
                verticalLineTo(17.711f)
                curveTo(2f, 19.421f, 3.39f, 20.801f, 5.09f, 20.801f)
                horizontalLineTo(8.09f)
                curveTo(9.85f, 20.801f, 11.18f, 19.471f, 11.18f, 17.711f)
                verticalLineTo(14.711f)
                curveTo(11.18f, 12.961f, 9.85f, 11.631f, 8.09f, 11.631f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.909f, 11.631f)
                horizontalLineTo(14.219f)
                curveTo(14.299f, 6.961f, 15.219f, 6.191f, 18.089f, 4.491f)
                curveTo(18.419f, 4.291f, 18.529f, 3.871f, 18.329f, 3.531f)
                curveTo(18.129f, 3.201f, 17.709f, 3.091f, 17.369f, 3.291f)
                curveTo(13.989f, 5.291f, 12.809f, 6.511f, 12.809f, 12.331f)
                verticalLineTo(17.721f)
                curveTo(12.809f, 19.431f, 14.199f, 20.811f, 15.899f, 20.811f)
                horizontalLineTo(18.899f)
                curveTo(20.659f, 20.811f, 21.989f, 19.481f, 21.989f, 17.721f)
                verticalLineTo(14.721f)
                curveTo(21.999f, 12.961f, 20.669f, 11.631f, 18.909f, 11.631f)
                close()
            }
        }.build()

        return _QuoteUp!!
    }

@Suppress("ObjectPropertyName")
private var _QuoteUp: ImageVector? = null
